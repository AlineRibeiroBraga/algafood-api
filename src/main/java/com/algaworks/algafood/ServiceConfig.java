package com.algaworks.algafood;

import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.service.AtivacaoClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClientService ativacaoClientService(Notificador notificador){
        return new AtivacaoClientService(notificador);
    }
}
