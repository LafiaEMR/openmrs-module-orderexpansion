package org.openmrs.module.orderexpansion.api.dao;

import javax.validation.constraints.NotNull;

import java.util.Optional;

import org.openmrs.module.orderexpansion.api.model.RadiologyProcedure;

public interface RadiologyProcedureDao {
	
	Optional<RadiologyProcedure> get(@NotNull int id);
	
	Optional<RadiologyProcedure> getRadiologyProcedureByUuid(@NotNull String uuid);
	
	RadiologyProcedure saveOrUpdate(@NotNull RadiologyProcedure procedure);
}
