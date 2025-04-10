package org.openmrs.module.orderexpansion.api.impl;

import javax.transaction.Transactional;

import java.util.*;

import org.openmrs.Encounter;
import org.openmrs.EncounterProvider;
import org.openmrs.Obs;
import org.openmrs.api.EncounterService;
import org.openmrs.api.context.Context;
import org.openmrs.module.orderexpansion.api.RadiologyProcedureService;
import org.openmrs.module.orderexpansion.api.dao.RadiologyProcedureDao;
import org.openmrs.module.orderexpansion.api.model.RadiologyProcedure;

@Transactional
public class RadiologyProcedureServiceImpl implements RadiologyProcedureService {
	
	private RadiologyProcedureDao procedureDao;
	
	public void setProcedureDao(RadiologyProcedureDao procedureDao) {
		this.procedureDao = procedureDao;
	}
	
	@Override
	public Optional<RadiologyProcedure> getRadiologyProcedureByUuid(String uuid) {
		return procedureDao.getRadiologyProcedureByUuid(uuid);
	}
	
	@Override
	public RadiologyProcedure saveOrUpdate(RadiologyProcedure radiologyProcedure) {
		List<Encounter> encounters = handleEncounter(radiologyProcedure);
		radiologyProcedure.setEncounters(encounters);
		return procedureDao.saveOrUpdate(radiologyProcedure);
	}
	
	/**
	 * Extract the obs and encounters from the payload and persist
	 * 
	 * @param procedure
	 * @return
	 */
	private List<Encounter> handleEncounter(RadiologyProcedure procedure) {
		if (procedure.getEncounters().isEmpty()) {
			return new ArrayList<>();
		}
		EncounterService service = Context.getEncounterService();
		List<Encounter> ret = new ArrayList<>();
		
		if (procedure.getEncounters() != null) {
			for (Encounter encounter : procedure.getEncounters()) {
				Encounter enc = new Encounter();
				enc.setEncounterDatetime(encounter.getEncounterDatetime());
				enc.setPatient(encounter.getPatient());
				enc.setEncounterType(encounter.getEncounterType());
				
				if (encounter.getEncounterProviders() != null) {
					Set<EncounterProvider> providers = new HashSet<>();
					for (EncounterProvider provider : encounter.getEncounterProviders()) {
						provider.setEncounter(enc);
						providers.add(provider);
					}
					enc.setEncounterProviders(providers);
				}
				
				if (encounter.getObs() != null) {
					Set<Obs> obset = new HashSet<>();
					for (Obs tobs : encounter.getObs()) {
						Obs obs = new Obs();
						obs.setPerson(encounter.getPatient());
						obs.setObsDatetime(encounter.getEncounterDatetime());
						obs.setConcept(tobs.getConcept());
						obs.setValueCoded(tobs.getValueCoded());
						obs.setEncounter(enc);
						obset.add(obs);
					}
					enc.setObs(obset);
				}
				
				service.saveEncounter(enc);
				ret.add(enc);
			}
		}
		return ret;
	}
}
