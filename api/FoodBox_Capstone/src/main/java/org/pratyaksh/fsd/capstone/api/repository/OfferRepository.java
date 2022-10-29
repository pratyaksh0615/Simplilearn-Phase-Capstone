package org.pratyaksh.fsd.capstone.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.pratyaksh.fsd.capstone.api.entity.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
