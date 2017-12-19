package com.cg.endpoint;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Person;
import com.cg.service.ISampleservice;

@RestController
@RequestMapping("person")
public class SampleController {

	@Autowired
	private ISampleservice iSampleservice;

	@PostMapping
	public Person add(@RequestBody Person person) {
		return iSampleservice.add(person);
	}

	@PutMapping
	public Person update(@RequestBody Person person) {
		return iSampleservice.update(person);
	}

	@GetMapping(value = "{email:.+}")
	public Person getByEmail(@PathVariable String email) {
		return iSampleservice.getByEmail(email);
	}

	@GetMapping
	public Set<Person> getAll() {
		return iSampleservice.getAll();
	}

	@DeleteMapping(value = "{email:.+}")
	public void remove(@PathVariable String email) {
		iSampleservice.remove(email);
	}
}
