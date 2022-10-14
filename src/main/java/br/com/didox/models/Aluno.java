package br.com.didox.models;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Double> notas;

    public List<Double> getNotas() {
        if(this.notas == null){
            this.notas = new ArrayList<Double>();
        }

        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public String situacao(){
        var media = this.media();
        if (media >= 7) return "Aprovado";
        else if( media >= 5 && media <= 6) return "Recuperação";
        else return "Reprovado";
    }

    public double media(){
        double calculoMedia = 0;
        for (Double nota : this.getNotas()) {
            calculoMedia += nota;
        }
        calculoMedia = calculoMedia / this.getNotas().size();
        return calculoMedia;
    }

    public String notasFormatada(){
        String notasSeparadasPorVirgula = "";
        for (Double nota : this.getNotas()) {
            notasSeparadasPorVirgula += nota + ",";
        }

        return notasSeparadasPorVirgula.substring(0, notasSeparadasPorVirgula.length() - 1);
    }

    public String notasFormatada(String mensagem){
        String notasSeparadasPorVirgula = "";
        for (Double nota : this.getNotas()) {
            notasSeparadasPorVirgula += nota + ", ";
        }

        return mensagem + ": " + notasSeparadasPorVirgula.substring(0, notasSeparadasPorVirgula.length() - 2);
    }

    public String nomeCompleto(){
        return this.nome + " - " + this.sobrenome;
    }
}
