package com.cg.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Person;
import com.cg.repo.ISampleRepo;

@Service
public class SampleService implements ISampleservice {

	@Autowired
	private ISampleRepo iSampleRepo;

	@Override
	public Person add(Person person) {
		return iSampleRepo.put(person);
	}

	@Override
	public Person update(Person person) {
		return iSampleRepo.edit(person);
	}

	@Override
	public Person getByEmail(String email) {
		return iSampleRepo.findByEmail(email);
	}

	@Override
	public Set<Person> getAll() {
		return iSampleRepo.findAll();
	}

	@Override
	public Person remove(String email) {
		return iSampleRepo.delete(email);
	}

}
