package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

public class ShippingBeanTest {
	
	ShippingBean bean;
	
	@Before
	public void setUp() throws Exception {
		bean=new ShippingBean();
		bean.setPin("560061");
		bean.setPid("1111");
		bean.setAddressLine2("qwerty");
		bean.setUid("Capgemini");
		bean.setPhone("789456123");
		bean.setEmail("Capgemini@gmail.com");
		bean.setQua(1);
		bean.setAddressLine1("asdfgh");
		bean.setPrice(1);
	}

	@Test
	public void testGetAddress() throws Exception {
		String result = bean.getAddress();
		assertEquals("asdfgh qwerty", result);
		assertNotEquals(2, bean.getPrice());
		assertNotNull(bean);
	}

	@Test
	public void testGetAddressLine1() throws Exception {
		String result = bean.getAddressLine1();
		assertEquals("asdfgh", result);
		assertTrue(1==bean.getQua());
		assertFalse(2==bean.getPrice());
	}

	@Test
	public void testGetAddressLine2() throws Exception {
		String result = bean.getAddressLine2();
		assertEquals("qwerty", result);
		assertTrue(1==bean.getQua());
	}

	@Test
	public void testGetEmail() throws Exception {
		String result = bean.getEmail();
		assertEquals("Capgemini@gmail.com", result);
		assertEquals("asdfgh", bean.getAddressLine1());
		assertNotNull(bean.getAddress());
	}

	@Test
	public void testGetPhone() throws Exception {
		String result = bean.getPhone();
		assertEquals("789456123", result);
	}

	@Test
	public void testGetPid() throws Exception {
		String result = bean.getPid();
		assertEquals("1111", result);
	}

	@Test
	public void testGetPin() throws Exception {
		String result = bean.getPin();
		assertEquals("560061", result);
	}

	@Test
	public void testGetPrice_1() throws Exception {
		int result = bean.getPrice();
		assertEquals(1, result);
	}

	@Test
	public void testGetQua_1() throws Exception {
		int result = bean.getQua();
		assertEquals(1, result);
	}

	@Test
	public void testGetUid_1() throws Exception {
		String result = bean.getUid();
		assertEquals("Capgemini", result);
	}

	@Test
	public void testSetAddressLine1_1() throws Exception {
		String addressLine1 = "DTP";
		bean.setAddressLine1(addressLine1);
	}

	@Test
	public void testSetAddressLine2_1() throws Exception {
		String addressLine2 = "Whitefield";
		bean.setAddressLine2(addressLine2);
	}

	@Test
	public void testSetEmail_1() throws Exception {
		String email = "@capgemini.com";
		bean.setEmail(email);
	}

	@Test
	public void testSetPhone_1() throws Exception {
		String phone = "456123789";
		bean.setPhone(phone);
	}

	@Test
	public void testSetPid_1() throws Exception {
		String pid = "aaaaaa";
		bean.setPid(pid);
	}

	@Test
	public void testSetPin_1() throws Exception {
		String pin = "4561";
		bean.setPin(pin);
	}

	@Test
	public void testSetPrice_1() throws Exception {
		int price = 2;
		bean.setPrice(price);
	}

	@Test
	public void testSetQua_1() throws Exception {
		int qua = 2;
		bean.setQua(qua);
	}

	@Test
	public void testSetUid_1() throws Exception {
		String uid = "DTP";
		bean.setUid(uid);
	}

	@After
	public void tearDown() throws Exception {
		bean=null;
		System.gc();
	}

}