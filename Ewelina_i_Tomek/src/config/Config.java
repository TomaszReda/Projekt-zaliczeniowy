/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.sun.mail.pop3.POP3SSLStore;
import data.Skrzynka;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Tomek i Ewelina
 */
public class Config {
    private Session session = null;
    private Store store = null;
    
    public void SMTP(Skrzynka skrzynaka)
    {
        Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(skrzynaka.getLogin(),skrzynaka.getHasło());
				}
			});
                
                
                /**
                 * Wysłanie wiadomosci 
                 */
                /*
                try {

                        Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("from-email@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("to-email@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler,"
				+ "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
                */
    }
    
    
    
    
  

      public void Pop3(Skrzynka skrzynka) throws Exception {
         try {
      Properties properties = new Properties();

      properties.put("mail.pop3.host", "pop.gmail.com");
      properties.put("mail.pop3.port", "995");
      properties.put("mail.pop3.starttls.enable", "true");
         session = Session.getInstance(properties, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(skrzynka.getLogin(),skrzynka.getHasło());
         }
        });

      //create the POP3 store object and connect with the pop server
       store = session.getStore("pop3s");

      store.connect("pop.gmail.com", skrzynka.getLogin(), skrzynka.getHasło());

      /*
      Wysłane wiadomosc
      */
      
      /*
      //create the folder object and open it
      Folder emailFolder = store.getFolder("INBOX");
      emailFolder.open(Folder.READ_ONLY);

      // retrieve the messages from the folder in an array and print it
      Message[] messages = emailFolder.getMessages();
      System.out.println("messages.length---" + messages.length);

      for (int i = 0, n = messages.length; i < n; i++) {
         Message message = messages[i];
         System.out.println("---------------------------------");
         System.out.println("Email Number " + (i + 1));
         System.out.println("Subject: " + message.getSubject());
         System.out.println("From: " + message.getFrom()[0]);
         System.out.println("Text: " + message.getContent().toString());

      }

      //close the store and folder objects
      emailFolder.close(false);
      store.close();
        */
      } catch (NoSuchProviderException e) {
         e.printStackTrace();
      } catch (MessagingException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
    
    
    
}
