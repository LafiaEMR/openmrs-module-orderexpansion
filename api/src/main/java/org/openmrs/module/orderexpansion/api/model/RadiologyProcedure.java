package org.openmrs.module.orderexpansion.api.model;

import java.util.Date;
import java.util.List;

import org.openmrs.BaseFormRecordableOpenmrsData;
import org.openmrs.Concept;
import org.openmrs.Encounter;
import org.openmrs.Location;
import org.openmrs.Patient;

public class RadiologyProcedure extends BaseFormRecordableOpenmrsData {
	
	public enum RadiologyProcedureStatus {
		PREPARATION,
		IN_PROGRESS,
		NOT_DONE,
		ON_HOLD,
		STOPPED,
		COMPLETED,
		PENDING_REVIEW
	}
	
	public enum RadiologyProcedureOutcome {
		SUCCESSFUL,
		NOT_SUCCESSFUL,
		PARTIALLY_SUCCESSFUL
	}
	
	private static final long serialVersionUID = 1L;
	
	private Integer radiologyId;
	
	private Patient patient;
	
	private RadiologyOrder radiologyOrder;
	
	private Concept concept;
	
	private Concept radiologyProcedureReason;
	
	private Concept category;
	
	private Concept bodySite;
	
	private RadiologyProcedure partOf;
	
	private Date startDatetime;
	
	private Date endDatetime;
	
	private RadiologyProcedureStatus status;
	
	private Concept statusReason;
	
	private RadiologyProcedureOutcome outcome;
	
	private String radiologyReport;
	
	public Concept modality;
	
	private List<Encounter> encounters;
	
	private Location location;
	
	public Integer getProcedureId() {
		return radiologyId;
	}
	
	public void setProcedureId(Integer radiologyId) {
		this.radiologyId = radiologyId;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public RadiologyOrder getRadiologyOrder() {
		return radiologyOrder;
	}
	
	public void setProcedureOrder(RadiologyOrder radiologyOrder) {
		this.radiologyOrder = radiologyOrder;
	}
	
	public Concept getConcept() {
		return concept;
	}
	
	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
	public Concept getCategory() {
		return category;
	}
	
	public void setCategory(Concept category) {
		this.category = category;
	}
	
	public Concept getBodySite() {
		return bodySite;
	}
	
	public void setBodySite(Concept bodySite) {
		this.bodySite = bodySite;
	}
	
	public RadiologyProcedure getPartOf() {
		return partOf;
	}
	
	public void setPartOf(RadiologyProcedure partOf) {
		this.partOf = partOf;
	}
	
	public Date getStartDatetime() {
		return startDatetime;
	}
	
	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}
	
	public Date getEndDatetime() {
		return endDatetime;
	}
	
	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}
	
	public RadiologyProcedureStatus getStatus() {
		return status;
	}
	
	public void setStatus(RadiologyProcedureStatus status) {
		this.status = status;
	}
	
	public RadiologyProcedureOutcome getOutcome() {
		return outcome;
	}
	
	public void setOutcome(RadiologyProcedureOutcome outcome) {
		this.outcome = outcome;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Concept getRadiologyProcedureReason() {
		return radiologyProcedureReason;
	}
	
	public void setRadiologyProcedureReason(Concept radiologyProcedureReason) {
		this.radiologyProcedureReason = radiologyProcedureReason;
	}
	
	public Concept getStatusReason() {
		return statusReason;
	}
	
	public void setStatusReason(Concept statusReason) {
		this.statusReason = statusReason;
	}
	
	public String getRadiologyReport() {
		return radiologyReport;
	}
	
	public void setRadiologyReport(String radiologyReport) {
		this.radiologyReport = radiologyReport;
	}
	
	public Concept getModality() {
		return modality;
	}
	
	public void setModality(Concept modality) {
		this.modality = modality;
	}
	
	public List<Encounter> getEncounters() {
		return encounters;
	}
	
	public void setEncounters(List<Encounter> encounters) {
		this.encounters = encounters;
	}
	
	@Override
	public Integer getId() {
		return getProcedureId();
	}
	
	@Override
	public void setId(Integer integer) {
		setProcedureId(integer);
	}
}
