package br.com.didox.drivers;

import br.com.didox.interfaces.ITipo;

public class Xml implements ITipo {
    @Override
    public void Salvar() {
        System.out.println("Estou salvando o dado como XML");
    }
    
}
