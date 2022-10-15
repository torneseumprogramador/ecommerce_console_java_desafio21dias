package br.com.didox.models;

import java.util.List;

import br.com.didox.abstracao.PessoaImpl;
import br.com.didox.interfaces.IPessoa;

public class Fornecedor extends PessoaImpl {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public List<IPessoa> Todos() {
        // TODO Auto-generated method stub
        return null;
    }
}
