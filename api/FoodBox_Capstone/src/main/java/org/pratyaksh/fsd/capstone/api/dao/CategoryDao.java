package org.pratyaksh.fsd.capstone.api.dao;

import java.util.List;

import org.pratyaksh.fsd.capstone.api.dto.Category;
import org.pratyaksh.fsd.capstone.api.exception.FoodBoxDaoException;

public interface CategoryDao {

	Category getCategory(Long id) throws FoodBoxDaoException;

	List<Category> getCategories() throws FoodBoxDaoException;

	Category save(Category category) throws FoodBoxDaoException;
	
	Category update(Category category) throws FoodBoxDaoException;
	
	void remove(Long id) throws FoodBoxDaoException;

	void setEnabled(Long id, Boolean enabled) throws FoodBoxDaoException;

	byte[] getCategoryImage(Long id) throws FoodBoxDaoException;

}
