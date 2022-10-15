package br.com.didox.abstracao;

import java.util.List;

import br.com.didox.enums.Tipo;
import br.com.didox.interfaces.IPessoa;
import br.com.didox.interfaces.ITipo;

public abstract class PessoaImpl implements IPessoa {
    public abstract List<IPessoa> Todos();

    public final void Salvar(ITipo tipo){
        tipo.Salvar();
    }

    public void SalvarSemStratagy(Tipo tipo){
        if(tipo == Tipo.JSON)
            System.out.println("Estou salvando o " + this.getClass().getName() + " dado como json");
        else if(tipo == Tipo.CSV)
            System.out.println("Estou salvando o " + this.getClass().getName() + " dado como CSV");
        else if(tipo == Tipo.XML)
            System.out.println("Estou salvando o " + this.getClass().getName() + " dado como XML");
        else if(tipo == Tipo.TXT)
            System.out.println("Estou salvando o " + this.getClass().getName() + " dado como XML");
    }
}
