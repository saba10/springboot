package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

public class AdminLoginTest {

	private AdminLogin admin;
	
	@Before
	public void setUp() throws Exception {
		admin=new AdminLogin();
		admin.setPassword("1111");
		admin.setUsername("Capgemini");
	}
	
	@Test
	public void testGetPassword_1() throws Exception {
		assertEquals("1111", admin.getPassword());
		assertEquals("Capgemini", admin.getUsername());
		assertNotNull(admin);
		assertFalse(admin.getPassword().equals("2222"));
	}

	@Test
	public void testGetUsername_1() throws Exception {
		assertNotEquals("15721", admin.getPassword());
		assertEquals("Capgemini", admin.getUsername());
		assertNotNull(admin);
		assertFalse(admin.getUsername().equals("DTP"));
	}

	@Test
	public void testSetPassword_1() throws Exception {
		String password = "8785";
		admin.setPassword(password);
		
		assertNotEquals("8080", admin.getPassword());
		assertEquals("Capgemini", admin.getUsername());
		assertEquals("8785", admin.getPassword());
	}

	@Test
	public void testSetUsername_1()
		throws Exception {
		String username = "DTP";
		admin.setUsername(username);
		assertNotEquals("Capgemini", admin.getUsername());
		assertEquals("DTP", admin.getUsername());
		assertEquals("1111", admin.getPassword());
	}

	@After
	public void tearDown() throws Exception {
		admin=null;
		System.gc();
	}

}