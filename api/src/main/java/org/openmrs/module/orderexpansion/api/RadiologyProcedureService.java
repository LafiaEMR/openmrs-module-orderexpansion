package org.openmrs.module.orderexpansion.api;

import javax.validation.constraints.NotNull;

import java.util.Optional;

import org.openmrs.module.orderexpansion.api.model.RadiologyProcedure;

public interface RadiologyProcedureService {
	
	Optional<RadiologyProcedure> getRadiologyProcedureByUuid(@NotNull String uuid);
	
	RadiologyProcedure saveOrUpdate(@NotNull RadiologyProcedure radiologyProcedure);
	
}
