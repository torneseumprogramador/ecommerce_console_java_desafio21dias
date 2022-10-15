package br.com.didox.Servicos;

import br.com.didox.interfaces.IPessoa;

public class PessoaServico {
  public static String Apresentar(IPessoa pessoa){
    return pessoa.getId() + " - " + pessoa.getNome() + " (" + pessoa.getClass().getName() + ")";
  }
}
