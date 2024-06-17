package com.fiap.axur.fiapaxurwhatsappsender.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MensagemDTO {

    private String nome;
    private String numero;
    private Integer pedido;
    private String email;
    private String mensagem;
}
