package org.openmrs.module.orderexpansion.api.model;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

import org.openmrs.*;

@Entity
@Table(name = "radiology_procedures")
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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "radiology_id")
	private Integer radiologyId;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name = "radiology_order_id")
	private RadiologyOrder radiologyOrder;
	
	@ManyToOne
	@JoinColumn(name = "concept")
	private Concept concept;
	
	@ManyToOne
	@JoinColumn(name = "radiology_reason")
	private Concept radiologyProcedureReason;
	
	@ManyToOne
	@JoinColumn(name = "category")
	private Concept category;
	
	@ManyToOne
	@JoinColumn(name = "body_site")
	private Concept bodySite;
	
	@ManyToOne
	@JoinColumn(name = "part_of")
	private RadiologyProcedure partOf;
	
	@Column(name = "start_datetime")
	private Date startDatetime;
	
	@Column(name = "end_datetime")
	private Date endDatetime;
	
	@Enumerated(EnumType.STRING)
	private RadiologyProcedureStatus status;
	
	@ManyToOne
	@JoinColumn(name = "status_reason")
	private Concept statusReason;
	
	@Enumerated(EnumType.STRING)
	private RadiologyProcedureOutcome outcome;
	
	@Column(name = "report")
	@Lob
	private String radiologyReport;
	
	@ManyToOne
	@JoinColumn(name = "modality")
	public Concept modality;
	
	@OneToMany
	@JoinTable(name = "encounter_radiology_procedures", joinColumns = @JoinColumn(name = "radiology_id"), inverseJoinColumns = @JoinColumn(name = "encounter_id"))
	private List<Encounter> encounters;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
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
