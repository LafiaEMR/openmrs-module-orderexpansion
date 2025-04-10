package org.openmrs.module.orderexpansion.api.model;

import java.util.Date;
import java.util.List;

import org.openmrs.BaseFormRecordableOpenmrsData;
import org.openmrs.Concept;
import org.openmrs.Encounter;
import org.openmrs.Location;
import org.openmrs.Patient;

public class Procedure extends BaseFormRecordableOpenmrsData {
	
	public enum ProcedureStatus {
		PREPARATION,
		IN_PROGRESS,
		NOT_DONE,
		ON_HOLD,
		STOPPED,
		COMPLETED,
		PENDING_REVIEW
	}
	
	public enum ProcedureOutcome {
		SUCCESSFUL,
		NOT_SUCCESSFUL,
		PARTIALLY_SUCCESSFUL
	}
	
	private static final long serialVersionUID = 1L;
	
	private Integer procedureId;
	
	private Patient patient;
	
	private ProcedureOrder procedureOrder;
	
	private Concept concept;
	
	private Concept procedureReason;
	
	private Concept category;
	
	private Concept bodySite;
	
	private Procedure partOf;
	
	private Date startDatetime;
	
	private Date endDatetime;
	
	private ProcedureStatus status;
	
	private Concept statusReason;
	
	private ProcedureOutcome outcome;
	
	private String procedureReport;
	
	public Concept modality;
	
	private List<Encounter> encounters;
	
	private Location location;
	
	public Integer getProcedureId() {
		return procedureId;
	}
	
	public void setProcedureId(Integer procedureId) {
		this.procedureId = procedureId;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public ProcedureOrder getProcedureOrder() {
		return procedureOrder;
	}
	
	public void setProcedureOrder(ProcedureOrder procedureOrder) {
		this.procedureOrder = procedureOrder;
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
	
	public Procedure getPartOf() {
		return partOf;
	}
	
	public void setPartOf(Procedure partOf) {
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
	
	public ProcedureStatus getStatus() {
		return status;
	}
	
	public void setStatus(ProcedureStatus status) {
		this.status = status;
	}
	
	public ProcedureOutcome getOutcome() {
		return outcome;
	}
	
	public void setOutcome(ProcedureOutcome outcome) {
		this.outcome = outcome;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Concept getProcedureReason() {
		return procedureReason;
	}
	
	public void setProcedureReason(Concept procedureReason) {
		this.procedureReason = procedureReason;
	}
	
	public Concept getStatusReason() {
		return statusReason;
	}
	
	public void setStatusReason(Concept statusReason) {
		this.statusReason = statusReason;
	}
	
	public String getProcedureReport() {
		return procedureReport;
	}
	
	public void setProcedureReport(String procedureReport) {
		this.procedureReport = procedureReport;
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
