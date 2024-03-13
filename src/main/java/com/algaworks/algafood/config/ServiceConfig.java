package com.algaworks.algafood.config;

import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.service.AtivacaoClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public AtivacaoClientService ativacaoClientService( ){
        return new AtivacaoClientService();
    }
}
