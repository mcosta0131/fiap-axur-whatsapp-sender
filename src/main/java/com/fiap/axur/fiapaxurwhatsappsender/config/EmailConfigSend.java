package com.fiap.axur.fiapaxurwhatsappsender.config;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import org.springframework.stereotype.Component;

@Component
public class EmailConfigSend {
    public static String usuario = "";
    public static String pass = "";
    public static String assunto = "Alerta de fraude - Casas bahia.";

    public static Properties configProperties() throws MessagingException {
        // Configurações do servidor de e-mail
        String servidor = "smtp.gmail.com";
        // Cria um objeto Properties para armazenar as configurações do servidor
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", servidor);
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        return props;
    }
}
