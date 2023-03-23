package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClientService {

    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();

        if(notificador != null){
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }
        else{
            System.out.println("Não existe notificador, mas cliente foi ativado");
        }
    }
}
