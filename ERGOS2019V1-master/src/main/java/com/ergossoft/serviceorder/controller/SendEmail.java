package com.ergossoft.serviceorder.controller;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Controller;

 

@Controller
public class SendEmail {

	public static String sendEmail(String email,String subject,String emailMsg) {
		try
	    {
			String toEmail=email;
			 
			
		    String smtpHostServer = "localhost";
		   //String emailID = "email_me@example.com";
		    
		    Properties props = System.getProperties();

		    final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		    // Get a Properties object
		      
		       props.setProperty("mail.smtp.host", "smtp.gmail.com");
		       props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		       props.setProperty("mail.smtp.socketFactory.fallback", "false");
		       props.setProperty("mail.smtp.port", "465");
		       props.setProperty("mail.smtp.socketFactory.port", "465");
		       props.put("mail.smtp.auth", "true");
		       props.put("mail.debug", "true");
		       props.put("mail.store.protocol", "pop3");
		       props.put("mail.transport.protocol", "smtp");
		  
		       final String username = "nthuser13@gmail.com";//
		         final String password = "nthphase123#";
		    try{
		    	   
		    	   SecurityManager security = System.getSecurityManager();
		    	    
		       Session session = Session.getInstance(props, 
		                            new Authenticator(){
		                               protected PasswordAuthentication getPasswordAuthentication() {
		                                  return new PasswordAuthentication(username, password);
		                               }}); 
		    
	      MimeMessage msg = new MimeMessage(session);
	      //set message headers
	      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	      msg.addHeader("format", "flowed");
	      msg.addHeader("Content-Transfer-Encoding", "8bit");

	      msg.setFrom(new InternetAddress("nthuser13@gmail.com", "ERGOS"));

	      msg.setReplyTo(InternetAddress.parse("nthuser13@gmail.com", false)); 

	      msg.setSubject(subject);

	      

	      msg.setSentDate(new Date());
	 
	      
	      msg.setText(emailMsg, "UTF-8", "html");
	      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
	       
    	  Transport.send(msg);  

	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    }catch(Exception e)
		{
	    	e.printStackTrace();
		}
		return "EMAIL SENT SUCCESS";	
		}
	
}
