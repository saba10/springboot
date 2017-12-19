package com.cg.repo;

import java.util.Set;

import com.cg.entity.Person;

public class MongoRepo implements ISampleRepo {

	@Override
	public Person put(Person person) {
		System.out.println("I am create method in  mongo repo");
		System.out.println(person);
		return null;
	}

	@Override
	public Person edit(Person person) {
		System.out.println("I am update method in mongo repo");
		System.out.println(person);
		return null;
	}

	@Override
	public Person findByEmail(String email) {
		System.out.println("I am findByEmail method in mongo repo");
		System.out.println(email);
		return null;
	}

	@Override
	public Set<Person> findAll() {
		System.out.println("I am findAll method in mongo repo");
		return null;
	}

	@Override
	public Person delete(String email) {
		System.out.println("I am delete method in mongo repo");
		System.out.println(email);
		return null;
	}

}
