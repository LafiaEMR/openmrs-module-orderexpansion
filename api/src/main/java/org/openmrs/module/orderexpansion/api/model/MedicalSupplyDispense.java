package org.openmrs.module.orderexpansion.api.model;

import java.util.Date;

import org.openmrs.BaseFormRecordableOpenmrsData;
import org.openmrs.Concept;
import org.openmrs.Encounter;
import org.openmrs.Location;
import org.openmrs.Order;
import org.openmrs.Patient;
import org.openmrs.User;

public class MedicalSupplyDispense extends BaseFormRecordableOpenmrsData {
	
	public enum MedicalSupplyStatus {
		PREPARATION,
		IN_PROGRESS,
		DECLINED,
		ON_HOLD,
		STOPPED,
		COMPLETED
	}
	
	private static final long serialVersionUID = 1L;
	
	private Integer medicalSupplyDispenseId;
	
	private Patient patient;
	
	private Encounter encounter;
	
	private Order medicalSupplyOrder;
	
	private Concept concept;
	
	private Date dateDispensed;
	
	private User dispenser;
	
	private Double quantity;
	
	private Concept quantityUnits;
	
	private MedicalSupplyStatus status;
	
	private Concept statusReason;
	
	private Location location;
	
	public Integer getMedicalSupplyDispenseId() {
		return medicalSupplyDispenseId;
	}
	
	public void setMedicalSupplyDispenseId(Integer medicalSupplyDispenseId) {
		this.medicalSupplyDispenseId = medicalSupplyDispenseId;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public Encounter getEncounter() {
		return encounter;
	}
	
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	
	public Order getMedicalSupplyOrder() {
		return medicalSupplyOrder;
	}
	
	public void setMedicalSupplyOrder(Order medicalSupplyOrder) {
		this.medicalSupplyOrder = medicalSupplyOrder;
	}
	
	public Concept getConcept() {
		return concept;
	}
	
	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
	public Date getDateDispensed() {
		return dateDispensed;
	}
	
	public void setDateDispensed(Date dateDispensed) {
		this.dateDispensed = dateDispensed;
	}
	
	public MedicalSupplyStatus getStatus() {
		return status;
	}
	
	public void setStatus(MedicalSupplyStatus status) {
		this.status = status;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Concept getStatusReason() {
		return statusReason;
	}
	
	public void setStatusReason(Concept statusReason) {
		this.statusReason = statusReason;
	}
	
	public Double getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	public Concept getQuantityUnits() {
		return this.quantityUnits;
	}
	
	public void setQuantityUnits(Concept quantityUnits) {
		this.quantityUnits = quantityUnits;
	}
	
	public User getDispenser() {
		return this.dispenser;
	}
	
	public void setDispenser(User dispenser) {
		this.dispenser = dispenser;
	}
	
	@Override
	public Integer getId() {
		return getMedicalSupplyDispenseId();
	}
	
	@Override
	public void setId(Integer integer) {
		setMedicalSupplyDispenseId(integer);
	}
	
}
