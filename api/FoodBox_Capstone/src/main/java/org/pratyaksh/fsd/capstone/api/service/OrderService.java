package org.pratyaksh.fsd.capstone.api.service;

import java.time.LocalDateTime;
import java.util.List;

import org.pratyaksh.fsd.capstone.api.dto.Order;
import org.pratyaksh.fsd.capstone.api.dto.User;
import org.pratyaksh.fsd.capstone.api.exception.FoodBoxServiceException;

public interface OrderService {

	List<Order> getOrders() throws FoodBoxServiceException;

	List<Order> getOrdersCreatedBetween(LocalDateTime start, LocalDateTime end) throws FoodBoxServiceException;

	List<Order> getOrdersByUser(User user) throws FoodBoxServiceException;

	List<Order> getOrdersByUserAndCreatedBetween(User user, LocalDateTime start, LocalDateTime end)
			throws FoodBoxServiceException;

	Order getOrder(Long id) throws FoodBoxServiceException;

	Order createOrder(Order order) throws FoodBoxServiceException;

	Order updateOrder(Order order) throws FoodBoxServiceException;

	Order deleteOrder(Long id) throws FoodBoxServiceException;

}
