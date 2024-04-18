package com.fiap.axur.fiapaxurwhatsappsender.controller;

import com.fiap.axur.fiapaxurwhatsappsender.model.MensagemDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsAppAlertController {

    @PostMapping("/alert")
    public void sendAlert(@RequestBody MensagemDTO mensagemDTO) {
        System.out.println(mensagemDTO.getNome());
    }
}
