package org.pratyaksh.fsd.capstone.api.service;

import java.util.List;

import org.pratyaksh.fsd.capstone.api.dto.Fee;
import org.pratyaksh.fsd.capstone.api.exception.FoodBoxServiceException;

public interface FeeService {

	List<Fee> getFees() throws FoodBoxServiceException;

	Fee getFee(String type) throws FoodBoxServiceException;

	Fee createFee(Fee fee) throws FoodBoxServiceException;

	Fee updateFee(Fee fee) throws FoodBoxServiceException;

	Fee deleteFee(String type) throws FoodBoxServiceException;

}
