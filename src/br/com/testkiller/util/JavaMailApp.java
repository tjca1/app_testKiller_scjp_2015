package br.com.testkiller.util;

import java.util.Properties;  
import javax.mail.Address;
import javax.mail.Message;  
import javax.mail.MessagingException;  
import javax.mail.PasswordAuthentication;  
import javax.mail.Session;  
import javax.mail.Transport;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
  
public class JavaMailApp  
{  
        
      public void enviaEmail(final String remetente,String destinatario, String assunto, String menssagem) throws MessagingException{  
            Properties props = new Properties();  
          
            /** Parâmetros de conexão com servidor Gmail */  
             props.put("mail.smtp.host", "smtp.mail.yahoo.com");  
             props.put("mail.smtp.socketFactory.port", "25");  
             props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");  
             props.put("mail.smtp.auth", "true");  
             props.put("mail.smtp.port", "25");  
  
            Session session = Session.getDefaultInstance(props,  
                        new javax.mail.Authenticator() {  
                             protected PasswordAuthentication getPasswordAuthentication()  
                             {  
                                   return new PasswordAuthentication("tjca1@yahoo.com.br","");  
                             }  
                        });  
  
                  /** Ativa Debug para sessão */  
                   session.setDebug(true);  
  
  
                  Message message = new MimeMessage(session);  
                  message.setFrom(new InternetAddress(remetente)); //Remetente  
  
                  Address[] toUser = InternetAddress //Destinatário(s)  
                             .parse(destinatario);  // ex: juliano@ibg.ind.br,cesar@ibg.ind.br,cristina@ibg.ind.br  
  
                  message.setRecipients(Message.RecipientType.TO, toUser);  
                  message.setSubject(assunto);//Assunto  
                  message.setText(menssagem);                    
                  /**Método para enviar a mensagem criada*/  
                  Transport.send(message);  
  
     }   
} 