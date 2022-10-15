package br.com.didox.models;

import java.util.List;

import br.com.didox.abstracao.PessoaImpl;
import br.com.didox.enums.Tipo;
import br.com.didox.interfaces.IPessoa;

public class Cliente extends PessoaImpl {
    private int id;
    private String nome;
    private String telefone;
    private String endereco;

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
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

    // === Não posso sobrescrever pois o método original é final
    // @Override
    // public void Salvar(ITipo tipo){
    //    System.out.println("Alterei o comportamento fazendo o polimorfismo");
    //    super.Salvar(tipo);
    // }

    @Override
    public void SalvarSemStratagy(Tipo tipo){
       System.out.println("Alterei o comportamento fazendo o polimorfismo");
       super.SalvarSemStratagy(tipo); // a pesar de alterar o comportamento método original, pelo super posso chamar o original mesmo assim
    }
}
