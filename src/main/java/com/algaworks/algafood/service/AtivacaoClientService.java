package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.NivelUrgencia;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClientService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void ativar(Cliente cliente){
        cliente.ativar();

        // dizer para o container que o cliente está ativo nesse momento
        applicationEventPublisher.publishEvent(new ClientAtivadoEvent(cliente));

    }

}
