package com.algaworks.algafood;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClientService ativacaoClientService;

    public MeuPrimeiroController(AtivacaoClientService ativacaoClientService) {
        this.ativacaoClientService = ativacaoClientService;
        System.out.println("MeuPrimeiroController: "+ ativacaoClientService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

        Cliente joao = new Cliente("João", "Joao@xwz.com", "123456789");
        ativacaoClientService.ativar(joao);

        return "Hello World!";
    }
}
