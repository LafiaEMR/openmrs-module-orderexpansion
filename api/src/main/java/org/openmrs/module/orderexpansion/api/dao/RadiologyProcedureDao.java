package org.openmrs.module.orderexpansion.api.dao;

import org.openmrs.module.orderexpansion.api.model.RadiologyProcedure;

import javax.validation.constraints.NotNull;
import java.util.Optional;

public interface RadiologyProcedureDao {
	
	Optional<RadiologyProcedure> get(@NotNull int id);
	
	Optional<RadiologyProcedure> getRadiologyProcedureByUuid(@NotNull String uuid);
	
	RadiologyProcedure saveOrUpdate(@NotNull RadiologyProcedure procedure);
}
