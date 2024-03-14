package com.algaworks.algafood.listener;

import com.algaworks.algafood.service.ClientAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadoListener(ClientAtivadoEvent clientAtivadoEvent){
        System.out.println("Emitindo nota fiscal para cliente." + clientAtivadoEvent.getCliente().getNome());
    }
}
