package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;

public class AtivacaoClientService {

    private Notificador notificador;

    public AtivacaoClientService(Notificador notificador) {
        this.notificador = notificador;
        System.out.println("AtivacaoClientService: "+ notificador);
    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
