package dev.java10x.CadastroNinja.Missoes;

import dev.java10x.CadastroNinja.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity //ele procura o primeiro ; ou } = nesse caso }
@Table(name = "tb_missoes")

    //TABELA DE MISSÕES
    public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //esses são nossos atributos dentro da nossa relação.
    private Long id;

    private String nome;

    private String dificuldade;

    //@OneToMany - Uma missão associado a vários ninjas.
    @OneToMany
    private List<NinjaModel> ninjas;
    //nosso ponto de origin = Responsável por RELACIONAR essa tabela aos NinjasModel
}