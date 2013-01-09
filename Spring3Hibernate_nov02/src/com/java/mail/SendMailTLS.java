package com.java.mail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
 
public class SendMailTLS {
 
	public void sendMail(String emailID) {
		final Properties props = new Properties();
		Logger log = Logger.getLogger(SendMailTLS.class);
		/*final String username = "username@gmail.com";
		final String password = "password";*/
		/*props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");*/
		
		try {
			//props.load(new FileInputStream("mail.properties"));
			props.load(getClass().getResourceAsStream("mail.properties")); 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(props.getProperty("username"), props.getProperty("password"));
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("chiranjeevi.tapal@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(emailID));
			message.setSubject("Congratulations.Registration successful.");
			message.setText("Dear subsriber,"+ "\n\n Thanks for joining us. Hope you enjoy making new friends.");
 
			Transport.send(message);
 
			log.info("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}