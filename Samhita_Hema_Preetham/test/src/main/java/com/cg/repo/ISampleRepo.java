package com.cg.repo;

import java.util.Set;

import com.cg.entity.Person;

public interface ISampleRepo {

	public Person put(Person person);

	public Person edit(Person person);

	public Person findByEmail(String email);

	public Set<Person> findAll();

	public Person delete(String email);

}
