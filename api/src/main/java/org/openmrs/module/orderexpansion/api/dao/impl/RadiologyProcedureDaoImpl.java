package org.openmrs.module.orderexpansion.api.dao.impl;

import static org.hibernate.criterion.Restrictions.eq;

import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.openmrs.module.orderexpansion.api.dao.RadiologyProcedureDao;
import org.openmrs.module.orderexpansion.api.model.RadiologyProcedure;

public class RadiologyProcedureDaoImpl implements RadiologyProcedureDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Optional<RadiologyProcedure> get(int id) {
		return Optional.empty();
	}
	
	@Override
	public Optional<RadiologyProcedure> getRadiologyProcedureByUuid(String uuid) {
		Criteria criteria = getCurrentSession().createCriteria(RadiologyProcedure.class);
		return Optional.ofNullable((RadiologyProcedure) criteria.add(eq("uuid", uuid)).uniqueResult());
	}
	
	@Override
	public RadiologyProcedure saveOrUpdate(RadiologyProcedure procedure) {
		getCurrentSession().saveOrUpdate(procedure);
		return procedure;
	}
}
