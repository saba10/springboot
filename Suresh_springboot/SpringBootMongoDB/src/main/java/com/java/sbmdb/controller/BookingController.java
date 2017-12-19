/**
 * 
 */
package com.java.sbmdb.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.sbmdb.models.Booking;
import com.java.sbmdb.models.BookingRepository;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	BookingRepository bookingRepository;
	//@RequestMapping(value = "/getall", method = RequestMethod.POST, consumes = "application/json", produces = "application/json") 
	@RequestMapping("/read-all")
	public List<Booking> readAll() {
		List<Booking> bookings = bookingRepository.findAll();
		System.out.println("-------------Test this method------------");
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Booking found successfully");
		dataMap.put("totalBooking", bookings.size());
		dataMap.put("status", "1");
		dataMap.put("bookings", bookings);
		return bookings;
	}

	@RequestMapping("/create")
	public Map<String, Object> create(Booking booking) {
		booking.setCustName("abc");
		booking.setCustId("0101");

		booking = bookingRepository.save(booking);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Booking created successfully");
		dataMap.put("status", "1");
		dataMap.put("booking", booking);
		return dataMap;
	}

	@RequestMapping("/read")
	public Map<String, Object> read(@RequestParam String Cust_Id) {
		List<Booking> booking = bookingRepository.findByCustId(Cust_Id);
		System.out.println("-------------Test read method------------");

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Booking found successfully");
		dataMap.put("status", "1");
		dataMap.put("booking", booking);
		return dataMap;

	}
}

/*
 * @RequestMapping("/update") public Map<String, Object> update(@RequestParam
 * String Id, @RequestParam String psngrName) { Booking booking =
 * bookingRepository.findOne(Id); booking.setPsngrName(psngrName); booking =
 * bookingRepository.save(booking); Map<String, Object> dataMap = new
 * HashMap<String, Object>(); dataMap.put("message",
 * "Booking updated successfully"); dataMap.put("status", "1");
 * dataMap.put("booking", booking); return dataMap; }
 */

/*
 * @RequestMapping("/delete") public Map<String, Object> delete(@RequestParam
 * String Id) { bookingRepository.delete(Id); Map<String, Object> dataMap = new
 * HashMap<String, Object>(); dataMap.put("message",
 * "Booking deleted successfully"); dataMap.put("status", "1"); return dataMap;
 * }
 */
