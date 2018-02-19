package com.cg.notification.repo;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cg.notification.Notification;
import com.cg.notification.NotificationType;
import com.cg.notification.ReadStatus;
import com.cg.notification.RecipientType;

/**
 * The class <code>NotificationRepoImplTest</code> contains tests for the class
 * <code>{@link NotificationRepoImpl}</code>.
 *
 * @generatedBy CodePro at 2/2/18 12:30 PM
 * @author samhia
 * @version $Revision: 1.0 $
 */
public class NotificationRepoImplTest {

	@InjectMocks
	NotificationRepoImpl notificationRepoImpl;

	@Mock
	private MongoRepo mongoRepo;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	private Notification getNotification() {
		Notification notification = new Notification();
		notification.setId("101");
		notification.setComment("Create notification");
		notification.setNotificationType(NotificationType.SUCCESS);
		notification.setReadStatus(ReadStatus.UNREAD);
		notification.setRecipientId("105");
		notification.setRecipientType(RecipientType.SMS);

		return notification;
	}

	@Test
	public void testGetAllNotification_1() throws Exception {
		/*
		 * NotificationRepoImpl fixture = new NotificationRepoImpl();
		 * Mockito.when(mongoRepo.insert(Mockito.isA(Notification.class))).thenReturn(
		 * getNotification()); List<Notification> result = fixture.getAllNotification();
		 * assertNotNull(result);
		 */
		Mockito.when(mongoRepo.findAll()).thenReturn(new ArrayList<>());
		notificationRepoImpl.getAllNotification();

	}

	@Test
	public void testGetByRecipientId_1() throws Exception {
		Mockito.when(mongoRepo.findOne(Mockito.isA(String.class))).thenReturn(getNotification());
		notificationRepoImpl.getByRecipientId("101");
		List<Notification> result = notificationRepoImpl.getByRecipientId("101");
		assertNotNull(result);
	}

	@Test
	public void testGetByRecipientType_1() throws Exception {
		Mockito.when(mongoRepo.findByRecipientType(RecipientType.EMAIL)).thenReturn(new ArrayList<>());
		List<Notification> result = notificationRepoImpl.getByRecipientType(RecipientType.EMAIL);
		notificationRepoImpl.getByRecipientType(RecipientType.EMAIL);
		assertNotNull(result);
	}

	@Test
	public void testGetNotificationById_1() throws Exception {
		Mockito.when(mongoRepo.findOne(Mockito.isA(String.class))).thenReturn(getNotification());
		notificationRepoImpl.getNotificationById("101");
		Notification result = notificationRepoImpl.getNotificationById("101");
		assertNotNull(result);
	}

	@Test
	public void testSaveNotification_1() throws Exception {
		Mockito.when(mongoRepo.insert(Mockito.isA(Notification.class))).thenReturn(getNotification());
		Notification result = notificationRepoImpl.saveNotification(new Notification());
		assertNotNull(result);
	}

	@Test
	public void testUpdateNotification_1() throws Exception {
		
		Mockito.when(mongoRepo.save(Mockito.isA(Notification.class))).thenReturn(getNotification());
		Notification result = notificationRepoImpl.updateNotification(new Notification());
		assertNotNull(result);
	}

	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NotificationRepoImplTest.class);
	}
}