/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/* Classe da ficha do aluno
 */

@Entity
public class FichaAluno implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFicha;
    
    @ManyToOne
    @JoinColumn(name = "id_aluno", nullable = false)
    private Aluno aluno;
    
    @Column(length = 20)
    private String tipoFicha;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "ficha_exercicios",
        joinColumns = @JoinColumn(name = "ficha_id"),
        inverseJoinColumns = @JoinColumn(name = "exercicio_id")
    )
    private List<Exercicios> exercicios;
    private double porcentagemGordura;
    private double peso;
    private double altura;
    private int minRep;
    private int maxRep;
    private int tempDescanso;
    private int serieExerc;
    private Date diaCriacaoFicha;
    
    @Column(length = 500)
    private String observacoes;

    public FichaAluno() {
    }
    
    public FichaAluno(int idFicha, Aluno aluno, String tipoFicha, List<Exercicios> exercicios, double porcentagemGordura, double peso, double altura, int minRep, int maxRep, int tempDescanso, int serieExerc, Date diaCriacaoFicha, String observacoes) {
        this.idFicha = idFicha;
        this.aluno = aluno;
        this.tipoFicha = tipoFicha;
        this.exercicios = exercicios;
        this.porcentagemGordura = porcentagemGordura;
        this.peso = peso;
        this.altura = altura;
        this.minRep = minRep;
        this.maxRep = maxRep;
        this.tempDescanso = tempDescanso;
        this.serieExerc = serieExerc;
        this.diaCriacaoFicha = diaCriacaoFicha;
        this.observacoes = observacoes;
    }

    public FichaAluno(Aluno aluno, String tipoFicha, List<Exercicios> exercicios, double porcentagemGordura, double peso, double altura, int minRep, int maxRep, int tempDescanso, int serieExerc, Date diaCriacaoFicha, String observacoes) {
        this.aluno = aluno;
        this.tipoFicha = tipoFicha;
        this.exercicios = exercicios;
        this.porcentagemGordura = porcentagemGordura;
        this.peso = peso;
        this.altura = altura;
        this.minRep = minRep;
        this.maxRep = maxRep;
        this.tempDescanso = tempDescanso;
        this.serieExerc = serieExerc;
        this.diaCriacaoFicha = diaCriacaoFicha;
        this.observacoes = observacoes;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public List<Exercicios> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicios> exercicios) {
        this.exercicios = exercicios;
    }

    public double getPorcentagemGordura() {
        return porcentagemGordura;
    }

    public void setPorcentagemGordura(double porcentagemGordura) {
        this.porcentagemGordura = porcentagemGordura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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

    public Date getDiaCriacaoFicha() {
        return diaCriacaoFicha;
    }

    public void setDiaCriacaoFicha(Date diaCriacaoFicha) {
        this.diaCriacaoFicha = diaCriacaoFicha;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
    
}
