package dev.java10x.CadastroNinja;

import jakarta.persistence.*;

@Entity //deixa de ser uma classe e vira uma entidade       //todo arquivo virou uma entidade
@Table(name="tb_cadasto") //dá um nome para a nossa relação
public class NinjaModel {


    //atributos da relação:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // essas duas anotações SEMPRE VÃO JUNTAS   IPC: qnd definimos eles o var abaixo automaticamente viraria nosso ID.
    private Long id;
    private String nome;
    private String email;
    private int idade;


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
