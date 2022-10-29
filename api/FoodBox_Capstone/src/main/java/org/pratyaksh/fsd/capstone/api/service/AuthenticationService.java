package org.pratyaksh.fsd.capstone.api.service;

import org.pratyaksh.fsd.capstone.api.dto.User;
import org.pratyaksh.fsd.capstone.api.exception.FoodBoxServiceException;

public interface AuthenticationService {

	User login(String email, String password, String role) throws FoodBoxServiceException;

	User register(User user) throws FoodBoxServiceException;

}
