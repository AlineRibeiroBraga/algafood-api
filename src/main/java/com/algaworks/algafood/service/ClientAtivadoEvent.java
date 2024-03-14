package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;

public class ClientAtivadoEvent { //representa o evento

    private Cliente cliente;

    public ClientAtivadoEvent(Cliente cliente){
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
