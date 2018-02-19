package com.cg.notification.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.MockAnnotationProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Update;

import static org.junit.Assert.*;
import com.cg.notification.Notification;
import com.cg.notification.RecipientType;
import com.cg.notification.repo.NotificationRepo;
import com.cg.notification.sender.NotificationSender;

/**
 * The class <code>NotificationServiceimplTest</code> contains tests for the
 * class <code>{@link NotificationServiceimpl}</code>.
 *
 * @generatedBy CodePro at 1/31/18 2:42 PM
 * @author samhia
 * @version $Revision: 1.0 $
 */
public class NotificationServiceimplTest {
	/**
	 * Run the List<Notification> getAllNotification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/18 2:42 PM
	 */

	@InjectMocks
	private NotificationServiceimpl notificationServiceimpl;

	@Mock
	private NotificationRepo notificationRepo;

	@Mock
	private NotificationSender<Notification> notificationSender;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllNotification_1() throws Exception {
		Mockito.when(notificationRepo.getAllNotification()).thenReturn(new ArrayList<>());
		List<Notification> result = notificationServiceimpl.getAllNotification();
		assertNotNull(result);
		assertTrue(result.isEmpty());
	}

	/**
	 * Run the List<Notification> getByRecipientId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/18 2:42 PM
	 *//*
	@Test(expected = RuntimeException.class)
	public void testGetByRecipientId_1() throws Exception {
		String recipientId = "";
		List<Notification> result = notificationServiceimpl.getByRecipientId(recipientId);
		assertNotNull(result);
	}

	*//**
	 * Run the List<Notification> getByRecipientType(RecipientType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/18 2:42 PM
	 *//*
	@Test(expected = RuntimeException.class)
	public void testGetByRecipientType_1() throws Exception {
		RecipientType type = RecipientType.EMAIL;
		List<Notification> result = notificationServiceimpl.getByRecipientType(type);
		assertNotNull(result);
	}

	*//**
	 * Run the Notification getNotificationById(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/18 2:42 PM
	 *//*
	@Test(expected = RuntimeException.class)
	public void testGetNotificationById_1() throws Exception {
		String id = "";
		Notification result = notificationServiceimpl.getNotificationById(id);
		//Mockito.when(notificationServiceimpl.getNotificationById(Mockito.isA(String.class))).thenReturn(null);
		assertNotNull(result);
	}

	*//**
	 * Run the Notification saveNotification(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/18 2:42 PM
	 *//*
	@Test(expected = RuntimeException.class)
	public void testSaveNotification_1() throws Exception {
		Notification result = notificationServiceimpl.saveNotification(new Notification());
		assertNotNull(result);
	}

	*//**
	 * Run the Notification updateNotification(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/18 2:42 PM
	 *//*
	@Test(expected = RuntimeException.class)
	public void testUpdateNotification_1() throws Exception {
		Notification notification = new Notification();
		notification.setId("");
		Notification result = notificationServiceimpl.updateNotification(notification);
		Mockito.when(notificationServiceimpl.saveNotification(notification)).thenReturn(notification);
		assertNotNull(result);
	}*/

}