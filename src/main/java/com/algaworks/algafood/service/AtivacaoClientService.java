package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClientService {

    private Notificador notificador;

    public void ativarClient(Cliente cliente){
        cliente.ativar();

//        NotificadorEmail notificador = new NotificadorEmail();
//        NotificadorSMS notificador = new NotificadorSMS();


//        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
