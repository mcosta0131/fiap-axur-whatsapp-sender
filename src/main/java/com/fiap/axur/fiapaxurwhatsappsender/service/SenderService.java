package com.fiap.axur.fiapaxurwhatsappsender.service;

import com.fiap.axur.fiapaxurwhatsappsender.config.EmailConfigSend;
import com.fiap.axur.fiapaxurwhatsappsender.model.MensagemDTO;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class SenderService {

    public void sendEmailMessage(MensagemDTO mensagemDTO) throws MessagingException {
        //TODO implementar envio de mensagem
        var props = EmailConfigSend.configProperties();
        // Cria um objeto Session para estabelecer a conexão com o servidor
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EmailConfigSend.usuario, EmailConfigSend.pass);
            }
        });

        // Cria um objeto MimeMessage para construir o e-mail
        MimeMessage message = new MimeMessage(session);

        // Define o remetente do e-mail
        message.setFrom(new InternetAddress(EmailConfigSend.usuario));

        // Define o destinatário do e-mail
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mensagemDTO.getEmail()));

        // Define o assunto do e-mail
        message.setSubject(EmailConfigSend.assunto);

        // Define o corpo do e-mail
        message.setText(mensagemDTO.getMensagem());

        // Envio do e-mail
        Transport.send(message);

        System.out.println("E-mail enviado com sucesso!");
    }

    public void sendTelegram(){}
    public void sendWhatsapp(){}
}
