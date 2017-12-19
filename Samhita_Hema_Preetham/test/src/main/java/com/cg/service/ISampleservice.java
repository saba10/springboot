package com.cg.service;

import java.util.Set;

import com.cg.entity.Person;

public interface ISampleservice {

	public Person add(Person person);

	public Person update(Person person);

	public Person getByEmail(String email);

	public Set<Person> getAll();

	public Person remove(String email);

}
