package org.openmrs.module.orderexpansion.api.model;

import java.util.Set;

import org.openmrs.Concept;
import org.openmrs.ServiceOrder;

public class RadiologyOrder extends ServiceOrder {
	
	private static final long serialVersionUID = 1L;
	
	private Concept specimenType;
	
	private Concept bodySite;
	
	private RadiologyOrder relatedOrder;
	
	private Set<RadiologyProcedure> radiologyOrders;
	
	public RadiologyOrder() {
	}
	
	@Override
	public RadiologyOrder copy() {
		RadiologyOrder newOrder = new RadiologyOrder();
		super.copyHelper(newOrder);
		return newOrder;
	}
	
	/**
	 * Creates a discontinuation order for this.
	 *
	 * @return the newly created order
	 * @see ServiceOrder#cloneForDiscontinuing()
	 */
	@Override
	public RadiologyOrder cloneForDiscontinuing() {
		RadiologyOrder newOrder = new RadiologyOrder();
		super.cloneForDiscontinuingHelper(newOrder);
		return newOrder;
	}
	
	/**
	 * Creates a ReferralOrder for revision from this order, sets the previousOrder, action field and
	 * other test order fields.
	 *
	 * @return the newly created order
	 */
	@Override
	public RadiologyOrder cloneForRevision() {
		RadiologyOrder newOrder = new RadiologyOrder();
		super.cloneForRevisionHelper(newOrder);
		return newOrder;
	}
	
	public Concept getSpecimenType() {
		return specimenType;
	}
	
	public void setSpecimenType(Concept specimenType) {
		this.specimenType = specimenType;
	}
	
	public Concept getBodySite() {
		return bodySite;
	}
	
	public void setBodySite(Concept bodySite) {
		this.bodySite = bodySite;
	}
	
	public RadiologyOrder getRelatedOrder() {
		return relatedOrder;
	}
	
	public void setRelatedOrder(RadiologyOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
	}
	
	public Set<RadiologyProcedure> getRadiologyOrders() {
		return radiologyOrders;
	}
	
	public void setRadiologyOrders(Set<RadiologyProcedure> radiologyOrders) {
		this.radiologyOrders = radiologyOrders;
	}
}
