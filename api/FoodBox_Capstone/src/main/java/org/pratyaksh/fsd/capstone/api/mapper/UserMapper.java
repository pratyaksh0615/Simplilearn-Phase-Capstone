package org.pratyaksh.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper
		extends EntityDtoMapper<org.pratyaksh.fsd.capstone.api.dto.User, org.pratyaksh.fsd.capstone.api.entity.User> {

}
