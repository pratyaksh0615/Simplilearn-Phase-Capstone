package org.pratyaksh.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CategoryMapper extends
		EntityDtoMapper<org.pratyaksh.fsd.capstone.api.dto.Category, org.pratyaksh.fsd.capstone.api.entity.Category> {

	@Mapping(target = "image", ignore = true)
	org.pratyaksh.fsd.capstone.api.entity.Category toEntity(org.pratyaksh.fsd.capstone.api.dto.Category dto);

	@Mapping(target = "image", ignore = true)
	org.pratyaksh.fsd.capstone.api.dto.Category toDto(org.pratyaksh.fsd.capstone.api.entity.Category entity);
	
}
