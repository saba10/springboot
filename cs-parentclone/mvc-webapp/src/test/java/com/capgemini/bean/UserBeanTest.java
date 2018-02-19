package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

public class UserBeanTest {
	
	UserBean user;
	
	@Before
	public void setUp() throws Exception {
		user=new UserBean();
		user.setLastName("bbbb");
		user.setEmail("aaaa@gmail.com");
		user.setProvider("LinkedIn");
		user.setFirstName("aaaa");
	}

	@Test
	public void testUserBean() throws Exception {
		assertNotNull(user);
	}

	@Test
	public void testGetEmail_1() throws Exception {
		String result = user.getEmail();
		assertEquals("aaaa@gmail.com", result);
		assertTrue(user.getFirstName().equals("aaaa"));
	}

	@Test
	public void testGetFirstName_1() throws Exception {
		String result = user.getFirstName();
		assertEquals("aaaa", result);
		assertNotEquals("Google", user.getProvider());
	}

	@Test
	public void testGetLastName_1() throws Exception {
		String result = user.getLastName();
		assertEquals("bbbb", result);
		assertFalse(user.getLastName().equals("aaaa"));
	}

	@Test
	public void testGetProvider_1() throws Exception {
		String result = user.getProvider();
		assertEquals("LinkedIn", result);
		assertNotNull(user);
	}

	@Test
	public void testSetEmail_1() throws Exception {
		String email = "bbbb@gmail.com";
		user.setEmail(email);
		assertEquals("bbbb@gmail.com", user.getEmail());
	}

	@Test
	public void testSetFirstName_1() throws Exception {
		String firstName = "cccc";
		user.setFirstName(firstName);
		assertNotNull(user.getFirstName());
	}

	@Test
	public void testSetLastName_1() throws Exception {
		String lastName = "dddd";
		user.setLastName(lastName);
		assertEquals("dddd", user.getLastName());
	}

	@Test
	public void testSetProvider_1() throws Exception {
		String provider = "Google";
		user.setProvider(provider);
		assertTrue(user.getProvider().equals("Google"));
	}

	@Test
	public void testToString_1() throws Exception {
		String result = user.toString();
		assertEquals("UserBean [firstName=aaaa, lastName=bbbb, email=aaaa@gmail.com, provider=LinkedIn]", result);
	}

	@After
	public void tearDown() throws Exception {
		user=null;
		System.gc();
	}

}