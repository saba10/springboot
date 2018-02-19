package com.cg.notification.endpoint;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.never;

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
import com.cg.notification.service.NotificationService;

/**
 * The class <code>NotificationControllerTest</code> contains tests for the
 * class <code>{@link NotificationController}</code>.
 *
 * @generatedBy CodePro at 2/2/18 2:12 PM
 * @author samhia
 * @version $Revision: 1.0 $
 */
public class NotificationControllerTest {

	@InjectMocks
	NotificationController notificationController;

	@Mock
	private NotificationService notificationService;

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
	
	private List<Notification> getNotifications(){
		List<Notification> list = new ArrayList<>();
		
		return list;
	}

	@Test
	public void testGetAllNotification_1() throws Exception {
		Mockito.when(notificationService.getAllNotification()).thenReturn(new ArrayList<>());
		List<Notification> result = notificationController.getAllNotification();
		notificationService.getAllNotification();
		assertNotNull(result);
	}

	@Test
	public void testGetByRecipientId_1() throws Exception {
		Mockito.when(notificationService.getByRecipientId(Mockito.isA(String.class))).thenReturn(getNotifications());
		List<Notification> result = notificationController.getByRecipientId("101");
		assertNotNull(result);
	}

	@Test
	public void testGetNotificationById_1() throws Exception {
		
		Mockito.when(notificationService.getNotificationById(Mockito.isA(String.class))).thenReturn(getNotification());
		notificationService.getNotificationById("101");
		Notification result = notificationController.getNotificationById("101");
		assertNotNull(result);
	}

	@Test
	public void testSaveNotification_1() throws Exception {
		
		Mockito.when(notificationService.saveNotification(Mockito.isA(Notification.class))).thenReturn(getNotification());
		Notification result = notificationController.saveNotification(new Notification());
		assertNotNull(result);
	}

	@Test
	public void testUpdateNotification_1() throws Exception {
		
		Mockito.when(notificationService.updateNotification(Mockito.isA(Notification.class))).thenReturn(getNotification());
		Notification result = notificationController.updateNotification(new Notification());
		assertNotNull(result);
	}

	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NotificationControllerTest.class);
	}
}