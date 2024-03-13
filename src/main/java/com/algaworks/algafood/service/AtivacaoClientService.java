package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.NivelUrgencia;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class AtivacaoClientService implements InitializingBean, DisposableBean {

    @TipoDoNotificador(value = NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

//    @PostConstruct
    public void init(){
        System.out.println("INIT" + notificador);
    }

//    @PreDestroy
    public void destroy2(){
        System.out.println("DESTROY");
    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

    //implementações das interfaces
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DESTROY");
    }
}
