package br.com.didox.interfaces;

import br.com.didox.enums.Tipo;

public interface IPessoa {
    int getId();
    void setId(int id);

    String getNome();
    void setNome(String nome);

    void SalvarSemStratagy(Tipo tipo);
    
    void Salvar(ITipo tipo);
}
