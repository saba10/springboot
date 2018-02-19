package com.cg.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.cg.notification.Notification;
import com.cg.notification.ReadStatus;
import com.cg.notification.RecipientType;
import com.cg.notification.repo.NotificationRepo;
import com.cg.notification.sender.NotificationSender;

@Service
public class NotificationServiceimpl implements NotificationService {

	@Autowired
	private NotificationRepo notificationRepo;

	@Autowired
	private NotificationSender<Notification> notificationSender;

	@Override
	public Notification saveNotification(Notification notification) {
		// TODO all business logic goes here
		notification.setId(null);
		notification.setReadStatus(ReadStatus.UNREAD);
		notification = notificationRepo.saveNotification(notification);
		notificationSender.sendNotification(notification);
		return notification;
	}

	@Override
	public Notification updateNotification(Notification notification) {
		// TTODO all business logic goes here
		Assert.notNull("Notification id cannot be null while updating", notification.getId());
		return notificationRepo.updateNotification(notification);
	}

	@Override
	public List<Notification> getAllNotification() {
		// TODO all business logic goes here
		return notificationRepo.getAllNotification();
	}

	@Override
	public Notification getNotificationById(String id) {
		// TODO all business logic goes here
		return notificationRepo.getNotificationById(id);
	}

	@Override
	public List<Notification> getByRecipientId(String recipientId) {
		return notificationRepo.getByRecipientId(recipientId);
	}

	@Override
	public List<Notification> getByRecipientType(RecipientType type) {
		// TODO Auto-generated method stub
		return notificationRepo.getByRecipientType(type);
	}
}