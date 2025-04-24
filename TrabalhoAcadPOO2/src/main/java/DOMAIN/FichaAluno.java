/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import java.util.List;

/* Classe da ficha do aluno
 */
public class FichaAluno {
    private String tipoFicha;
    private List<String> exercicios;
    private int minRep;
    private int maxRep;
    private int tempDescanso;
    private int serieExerc;
    private String observacoes;

    public FichaAluno(String tipoFicha, List<String> exercicios, int minRep, int maxRep, int tempDescanso, int serieExerc, String observacoes) {
        this.tipoFicha = tipoFicha;
        this.exercicios = exercicios;
        this.minRep = minRep;
        this.maxRep = maxRep;
        this.tempDescanso = tempDescanso;
        this.serieExerc = serieExerc;
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
    public String getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public List<String> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<String> exercicios) {
        this.exercicios = exercicios;
    }

    public int getMinRep() {
        return minRep;
    }

    public void setMinRep(int minRep) {
        this.minRep = minRep;
    }

    public int getMaxRep() {
        return maxRep;
    }

    public void setMaxRep(int maxRep) {
        this.maxRep = maxRep;
    }

    public int getTempDescanso() {
        return tempDescanso;
    }

    public void setTempDescanso(int tempDescanso) {
        this.tempDescanso = tempDescanso;
    }

    public int getSerieExerc() {
        return serieExerc;
    }

    public void setSerieExerc(int serieExerc) {
        this.serieExerc = serieExerc;
    }
    
    
}
