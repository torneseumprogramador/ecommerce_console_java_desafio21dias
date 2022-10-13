package br.com.didox;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
}
