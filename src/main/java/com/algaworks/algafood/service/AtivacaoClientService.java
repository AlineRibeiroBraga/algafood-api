package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClientService {

    @Autowired
    private List<Notificador> notificadores;

    public void ativar(Cliente cliente) {
        cliente.ativar();


        notificadores.forEach(notificador -> {
                notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
            }
        );
    }
}
