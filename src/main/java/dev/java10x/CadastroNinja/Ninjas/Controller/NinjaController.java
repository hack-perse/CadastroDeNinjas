package dev.java10x.CadastroNinja.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //controlador para API's Rest
@RequestMapping //torna mapeado = sempre usamos ele dps do @RestController
public class NinjaController {

    @GetMapping("/boasVindas") //ele pega informações   //especificando a rota dele
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota"; //resultado para todos que acessarem essa rota
    }

}

/*
* @PostMapping - manda informações
* @PutMapping - alterar informações
* @PatchMapping - "
* @DeleteMapping - deletar informações
* */