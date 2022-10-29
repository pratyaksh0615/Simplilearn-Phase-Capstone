package org.pratyaksh.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper(uses = { FoodMapper.class })
public interface OrderItemMapper extends
		EntityDtoMapper<org.pratyaksh.fsd.capstone.api.dto.OrderItem, org.pratyaksh.fsd.capstone.api.entity.OrderItem> {

	org.pratyaksh.fsd.capstone.api.entity.OrderItem toEntity(org.pratyaksh.fsd.capstone.api.dto.OrderItem dto);

	org.pratyaksh.fsd.capstone.api.dto.OrderItem toDto(org.pratyaksh.fsd.capstone.api.entity.OrderItem entity);

}
