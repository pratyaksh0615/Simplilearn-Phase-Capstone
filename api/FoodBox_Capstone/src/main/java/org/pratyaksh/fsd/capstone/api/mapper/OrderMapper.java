package org.pratyaksh.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { OrderItemMapper.class, UserMapperService.class })
public interface OrderMapper
		extends EntityDtoMapper<org.pratyaksh.fsd.capstone.api.dto.Order, org.pratyaksh.fsd.capstone.api.entity.Order> {

	@Mapping(source = "userId", target = "user")
	org.pratyaksh.fsd.capstone.api.entity.Order toEntity(org.pratyaksh.fsd.capstone.api.dto.Order dto);

	@Mapping(source = "user", target = "userId")
	org.pratyaksh.fsd.capstone.api.dto.Order toDto(org.pratyaksh.fsd.capstone.api.entity.Order entity);

}
