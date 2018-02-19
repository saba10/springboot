package com.cg.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.cg.entity.CustomerFeedback;

public interface CustomerRepository extends CassandraRepository<CustomerFeedback> {

	// @Query(value = "SELECT * FROM customer WHERE firstname=?0")
	// public List<Customer> findByFirstname(String firstname);
	//
	// @Query("SELECT * FROM customer WHERE age > ?0 ALLOW FILTERING")
	// public List<Customer> findCustomerHasAgeGreaterThan(int age);

	@Query("SELECT * FROM feedback WHERE productId =?0 ALLOW FILTERING")
	public List<CustomerFeedback> findByProductId(String pid);
}