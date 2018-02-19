package com.cg.userprofile.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.userprofile.User;


public interface UserProfileRepo extends JpaRepository<User, Long> {

	/*
	 * @Query("select u from User u where u.username = userName") public List<User>
	 * getByUserName(@Param("userName") String userName);
	 */
	public List<User> findByUserName(String userName);

	//public List<User> findByEmailAndMobileNo(String email, String mobileNo);
}
