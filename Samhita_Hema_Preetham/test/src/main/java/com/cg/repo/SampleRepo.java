package com.cg.repo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.cg.entity.Person;

@Repository
public class SampleRepo implements ISampleRepo {

	private Set<Person> set = new HashSet<>();

	@Override
	public Person put(Person person) {
		System.out.println("I am create method in repo");
		System.out.println(person);
		set.add(person);
		return person;
	}

	@Override
	public Person edit(Person person) {
		System.out.println("I am update method in repo");
		System.out.println(person);
		if (set.contains(person)) {
			set.remove(person);
			set.add(person);
		}
		return person;
	}

	@Override
	public Person findByEmail(String email) {
		System.out.println("I am findByEmail method in repo");
		System.out.println(email);
		Person p = set.stream().filter(person -> {
			return person.getEmail().equalsIgnoreCase(email);
		}).findFirst().get();
		if (p != null) {
			return p;
		}
		return null;
	}

	@Override
	public Set<Person> findAll() {
		System.out.println("I am findAll method in repo");
		return set;
	}

	@Override
	public Person delete(String email) {
		System.out.println("I am delete method in repo");
		System.out.println(email);
		Person p = set.stream().filter(person -> {
			return person.getEmail().equalsIgnoreCase(email);
		}).findFirst().get();
		if (p != null) {
			set.remove(p);
		}
		return null;
	}

}
