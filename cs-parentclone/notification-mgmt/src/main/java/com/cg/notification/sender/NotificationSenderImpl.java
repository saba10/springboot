package com.cg.notification.sender;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
import com.cg.notification.Notification;
import com.cg.userprofile.User;

@Service
public class NotificationSenderImpl extends AbstractNotificationSender<Notification> {

	@Autowired
	private RestTemplate restTemplate;

	private static final String FROM = "preetham.g-r@capgemini.com";

	private static final String SUBJECT = "Email from CFSD case study";

	private String USER_PROFILE_SERVICE = "http://user-profile/";

	private String getEmailFromUser(String userId) {
		String email = this.restTemplate
				.getForEntity(USER_PROFILE_SERVICE + "users/findbyid?userId=" + userId, User.class).getBody()
				.getUserName();
		return email;
	}

	private void sendEmailFromAWS(Notification t) {
		try {
			AmazonSimpleEmailService client = AmazonSimpleEmailServiceClientBuilder.standard()
					.withRegion(Regions.US_WEST_2).build();
			SendEmailRequest request = new SendEmailRequest()
					.withDestination(new Destination().withToAddresses(getEmailFromUser(t.getRecipientId())))
					.withMessage(new Message()
							.withBody(new Body().withText(new Content().withCharset("UTF-8").withData(t.getComment())))
							.withSubject(new Content().withCharset("UTF-8").withData(SUBJECT)))
					.withSource(FROM);
			client.sendEmail(request);
		} catch (Exception ex) {
			System.out.println("The email was not sent. Error message: " + ex.getMessage());
		}
	}

	@Override
	public CompletableFuture<String> sendEmailNotification(Notification t) {
		CompletableFuture<String> future = new CompletableFuture<>();
		sendEmailFromAWS(t);
		future.complete("sent email from future");
		return future;
	}

	@Override
	public CompletableFuture<String> sendSmsNotification(Notification t) {
		CompletableFuture<String> future = new CompletableFuture<>();
		future.complete("sent sms from future");
		return future;
	}
}
