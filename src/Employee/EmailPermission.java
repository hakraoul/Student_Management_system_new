/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Employee;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailPermission {
    public static void main(String recepient,String reason,String subject,String duration,String name) throws MessagingException {
        // TODO code application logic here
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        //properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        String myAccount = "curryhak12@gmail.com";
        String password = "fgekfzuiilrrndqv";

        Session session = Session.getInstance(properties,new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccount,password);
            }
        });

        Message message = prepareMessage(session,myAccount,recepient,reason,subject,duration,name);
        Transport.send(message);
        System.out.println("Send success");
    }
    private static Message prepareMessage(Session session,String myAccount,String recepient,String reason,String subject,String duration,String name){
        Message message = new MimeMessage(session);
        try{

            message.setFrom(new InternetAddress(myAccount));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
            message.setSubject(subject + " - for " + duration + " from " + name);
            message.setText(reason);
            //return message;
        }catch(Exception ex){
            System.out.println("" + ex);
        }
        return message;
    }
}
