package com.fiap.axur.fiapaxurwhatsappsender.controller;

import com.fiap.axur.fiapaxurwhatsappsender.model.MensagemDTO;
import com.fiap.axur.fiapaxurwhatsappsender.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class AlertController {

    @Autowired
    private SenderService senderService;

    @PostMapping("/alert")
    public void sendAlert(@RequestBody MensagemDTO mensagemDTO) throws MessagingException {

        senderService.sendEmailMessage(mensagemDTO);
    }
}
