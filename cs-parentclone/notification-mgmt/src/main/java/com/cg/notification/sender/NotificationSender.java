package com.cg.notification.sender;

import java.util.concurrent.CompletableFuture;

public interface NotificationSender<T> {

	public void sendNotification(T t);

	public CompletableFuture<String> sendEmailNotification(T t);

	public CompletableFuture<String> sendSmsNotification(T t);

}
