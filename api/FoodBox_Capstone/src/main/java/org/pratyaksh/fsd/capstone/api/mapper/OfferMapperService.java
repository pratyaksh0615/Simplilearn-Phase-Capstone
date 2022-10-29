package org.pratyaksh.fsd.capstone.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface OfferMapperService {

	default org.pratyaksh.fsd.capstone.api.entity.Offer findById(Long id) {
		if (id == null) {
			return null;
		}

		org.pratyaksh.fsd.capstone.api.entity.Offer offer = new org.pratyaksh.fsd.capstone.api.entity.Offer();
		offer.setId(id);

		return offer;
	}

	default Long findByOffer(org.pratyaksh.fsd.capstone.api.entity.Offer offer) {
		if (offer == null) {
			return null;
		}

		return offer.getId();
	}

}
