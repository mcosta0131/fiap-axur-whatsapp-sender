package com.fiap.axur.fiapaxurwhatsappsender.controller;

import com.fiap.axur.fiapaxurwhatsappsender.model.MensagemDTO;
import com.fiap.axur.fiapaxurwhatsappsender.service.WhatsAppSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsAppAlertController {

    @Autowired
    private WhatsAppSenderService whatsAppSenderService;

    @PostMapping("/alert")
    public void sendAlert(@RequestBody MensagemDTO mensagemDTO) {
        whatsAppSenderService.sendMessage(mensagemDTO);
    }
}
