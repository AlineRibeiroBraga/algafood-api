package com.algaworks.algafood.listener;

import com.algaworks.algafood.notificacao.NivelUrgencia;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.TipoDoNotificador;
import com.algaworks.algafood.service.ClientAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClientAtivadoEvent clientAtivadoEvent){
        notificador.notificar(clientAtivadoEvent.getCliente(), "Seu cadastro no sistema está ativo.");
        System.out.println("Cliente "+ clientAtivadoEvent.getCliente().getNome() + "agora está ativo.");
    }

    @EventListener
    public void clienteAtivadoListener2(ClientAtivadoEvent clientAtivadoEvent){
        notificador.notificar(clientAtivadoEvent.getCliente(), "Seu cadastro no sistema está ativo.");
        System.out.println("Cliente "+ clientAtivadoEvent.getCliente().getNome() + "agora está ativo.");
    }
}
