package org.pratyaksh.fsd.capstone.api.service;

import java.time.LocalDateTime;
import java.util.List;

import org.pratyaksh.fsd.capstone.api.dto.User;
import org.pratyaksh.fsd.capstone.api.exception.FoodBoxServiceException;

public interface UserService {

	User getUser(String email) throws FoodBoxServiceException;

	List<User> getUsers() throws FoodBoxServiceException;

	List<User> getUsersCreatedBetween(LocalDateTime start, LocalDateTime end) throws FoodBoxServiceException;

}
