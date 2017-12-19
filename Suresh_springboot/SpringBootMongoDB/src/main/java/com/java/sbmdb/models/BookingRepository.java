package com.java.sbmdb.models;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {


	@Query("{'Cust_Id' : ?0}")
	  public List<Booking> findByCustId(String Cust_Id);
}
