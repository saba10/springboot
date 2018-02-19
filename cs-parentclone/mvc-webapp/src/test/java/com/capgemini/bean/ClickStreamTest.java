package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

public class ClickStreamTest {

	private ClickStream click;

	@Before
	public void setUp() throws Exception {
		click = new ClickStream();
		click.setUserId("Capgemini");
		click.setUserUrl("www.capgemini.com");
		click.setTimestam("60sec");
	}

	@Test
	public void testGetTimestam() throws Exception {
		String result = click.getTimestam();
		assertNotNull(click);
		assertNotEquals("450", result);
		assertEquals("60sec", result);
		assertTrue(click.getUserId().equals("Capgemini"));
		assertNotNull(click.getUserUrl());
	}

	@Test
	public void testGetUserId() throws Exception {
		String result = click.getUserId();
		assertNotNull(click);
		assertNotEquals("DTP", result);
		assertEquals("Capgemini", result);
		assertTrue(click.getTimestam().equals("60sec"));
		assertFalse(click.getUserUrl().equals("www.google.com"));
	}

	@Test
	public void testGetUserUrl() throws Exception {
		String result = click.getUserUrl();
		assertNotNull(click);
		assertNotEquals("www.google.com", result);
		assertEquals("www.capgemini.com", result);
		assertTrue(click.getTimestam().equals("60sec"));
		assertFalse(click.getUserId().equals("DTP"));
	}

	@Test
	public void testSetTimestam() throws Exception {
		String timestam = "7515";
		click.setTimestam(timestam);
		assertEquals("Capgemini", click.getUserId());
		assertNotEquals("DTP", click.getUserId());
		assertEquals("www.capgemini.com", click.getUserUrl());
		assertNotEquals("www.google.com", click.getUserId());
		assertTrue(click.getTimestam().equals("7515"));
		assertFalse(click.getTimestam().equals("755"));

	}

	@Test
	public void testSetUserId() throws Exception {
		String userId = "DTP";
		click.setUserId(userId);
		assertEquals("DTP", click.getUserId());
		assertFalse(click.getUserId().equals("Capgemini"));
		assertEquals("www.capgemini.com", click.getUserUrl());
		assertNotEquals("www.google.com", click.getUserId());
		assertTrue(click.getTimestam().equals("60sec"));
		assertFalse(click.getTimestam().equals("7515"));
	}

	@Test
	public void testSetUserUrl() throws Exception {
		String userUrl = "talent.capgemini.com";
		click.setUserUrl(userUrl);
		assertEquals("talent.capgemini.com", click.getUserUrl());
		assertFalse(click.getUserUrl().equals("www.capgemini.com"));
		assertEquals("Capgemini", click.getUserId());
		assertNotEquals("www.google.com", click.getUserId());
		assertTrue(click.getTimestam().equals("60sec"));
		assertFalse(click.getTimestam().equals("7515"));

	}

	@After
	public void tearDown() throws Exception {
		click = null;
		System.gc();
	}

}