package br.com.didox.models;

import java.util.List;

import br.com.didox.abstracao.PessoaImpl;
import br.com.didox.interfaces.IPessoa;

public class Pessoa extends PessoaImpl {
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

    @Override
    public List<IPessoa> Todos() {
        // TODO Auto-generated method stub
        return null;
    }
}
