package br.com.didox.models;

public class Pessoa {
    private int id;
    protected String nome;
    protected String sobrenome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String nomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }
}
