package org.pratyaksh.fsd.capstone.api.dao;

import java.util.List;

import org.pratyaksh.fsd.capstone.api.dto.Fee;
import org.pratyaksh.fsd.capstone.api.exception.FoodBoxDaoException;

public interface FeeDao {

	Fee getFee(String type) throws FoodBoxDaoException;

	List<Fee> getFees() throws FoodBoxDaoException;

	Fee save(Fee fee) throws FoodBoxDaoException;

	void remove(String type) throws FoodBoxDaoException;

}
