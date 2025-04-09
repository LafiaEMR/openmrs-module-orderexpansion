package org.openmrs.module.orderexpansion.api;

import org.openmrs.module.orderexpansion.api.model.RadiologyProcedure;

import javax.validation.constraints.NotNull;
import java.util.Optional;

public interface RadiologyProcedureService {
	
	Optional<RadiologyProcedure> getRadiologyProcedureByUuid(@NotNull String uuid);

	RadiologyProcedure saveOrUpdate(@NotNull RadiologyProcedure radiologyProcedure);
	
}
