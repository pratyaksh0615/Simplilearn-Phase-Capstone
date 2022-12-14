package org.pratyaksh.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapperService {

	default org.pratyaksh.fsd.capstone.api.entity.User findById(String email) {
		if (email == null) {
			return null;
		}

		org.pratyaksh.fsd.capstone.api.entity.User user = new org.pratyaksh.fsd.capstone.api.entity.User();
		user.setEmail(email);

		return user;
	}

	default String findByUser(org.pratyaksh.fsd.capstone.api.entity.User user) {
		if (user == null) {
			return null;
		}

		return user.getEmail();
	}

}
