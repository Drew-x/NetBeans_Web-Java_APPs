/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package SessionJavaBean;

//import java.security.Security;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.mail.Message;

import javax.mail.Session;
import javax.mail.Transport;
//import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author I-KingDrew-I
 */
@Stateless
public class MailSenderBean {

    public void sendEmail(String fromEmail, String userName, String passWord, 
            String toMail, String subject, String message){ // function used by Servlet to pass in those parameters 
    
        try {
            // Steps to configure Java Mail API
            
            
            //Step one - Properties
            
            Properties props = System.getProperties(); // Creates instance of properties
           
           // Security.addProvider( new com.sun.net.ssl.internal.ssl.Provider());
            
            // Configuring intance of Properties "props"
            
            props.put("mail.smtp.host" , "smtp.gmail.com");
            props.put("mail.smtp.auth" , "true");
            props.put("mail.smtp.port" , "465");
            props.put("mail.smtp.socketFactory.class" , "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.port" , "465");
            props.put("mail.smtp.socketFactory.fallback" , "false");
            
            //*************************************************************************************
            
            // Step Two - Create Session instance
            // Session intance takes use of above created properties
            
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(true);// this well debuggiing session in process
            
            
            //*************************************************************************************
            
            // Step 3 create a Message instacne from java API - using session created above
            
            Message mailMessage = new MimeMessage(mailSession);
            
            mailMessage.setFrom(new InternetAddress(fromEmail)); // This sets the From email and needs to be wraped with a try catch
            mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toMail)); //Sets the Recipients type can be cc mail, bcc mail, or tomail
           
            mailMessage.setContent(message,"text/html"); // this is the message the recipient is going to read ("message") parameters (message, type)
            //mailMessage.setText(message); 
            mailMessage.setSubject(subject);
            
            
         //*************************************************************************************
         
         //Step 4 create Transport instance using session "mailSession" created above
         
         Transport transport = mailSession.getTransport("smtp"); //- helps sending message threw smtp portocal
         transport.connect("smtp.gmail.com",userName,passWord); // helps estableh connection threw user name and password
         
         transport.sendMessage(mailMessage, mailMessage.getAllRecipients()); // sends the message and selects the recipients from setRecipents
        
         
        //*************************************************************************************
        
        } catch (Exception ex) { // Erase "Address" from AddressException to be left with "Exception" --created from step 3 
            Logger.getLogger(MailSenderBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
