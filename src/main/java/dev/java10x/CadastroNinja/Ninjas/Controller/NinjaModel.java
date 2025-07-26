package dev.java10x.CadastroNinja.Ninjas.Controller;

import dev.java10x.CadastroNinja.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

                                //TABELA PRINCIPAL

@Entity //deixa de ser uma classe e vira uma entidade       //todo arquivo virou uma entidade
@Table(name="tb_cadasto") //dá um nome para a nossa relação

    //TABELA DE NINJAS
public class NinjaModel {


    //atributos da relação:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // essas duas anotações SEMPRE VÃO JUNTAS   IPC: qnd definimos eles o var abaixo automaticamente viraria nosso ID.

    //Esses são os nossos atributos.
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //@ManyToOne - UM ninja está associado a VÁRIAS missões
    @ManyToOne
    @JoinColumn(name = "missoes_id") //chave estrangeira
    private MissoesModel missoes;

    //alt + insert -> constructor
    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
