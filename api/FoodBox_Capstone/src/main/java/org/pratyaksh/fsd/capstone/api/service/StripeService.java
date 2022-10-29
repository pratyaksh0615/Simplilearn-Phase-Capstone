package org.pratyaksh.fsd.capstone.api.service;

import org.pratyaksh.fsd.capstone.api.dto.ChargeRequest;
import org.pratyaksh.fsd.capstone.api.exception.FoodBoxServiceException;

import com.stripe.model.Charge;

public interface StripeService {

	Charge charge(ChargeRequest chargeRequest) throws FoodBoxServiceException;

}
