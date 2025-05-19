/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/* Classe da ficha do aluno
 */

@Entity
public class FichaAluno implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFicha;
    
    @OneToOne
    @JoinColumn(unique = true, nullable = false)
    private int idAluno;
    
    @Column(length = 20)
    private String tipoFicha;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "ficha_exercicios",
        joinColumns = @JoinColumn(name = "ficha_id"),
        inverseJoinColumns = @JoinColumn(name = "exercicio_id")
    )
    private List<Exercicios> exercicios;
    private int minRep;
    private int maxRep;
    private int tempDescanso;
    private int serieExerc;
    
    @Column(length = 500)
    private String observacoes;

    public FichaAluno(int idFicha, int idAluno, String tipoFicha, List<Exercicios> exercicios, int minRep, int maxRep, int tempDescanso, int serieExerc, String observacoes) {
        this.idFicha = idFicha;
        this.idAluno = idAluno;
        this.tipoFicha = tipoFicha;
        this.exercicios = exercicios;
        this.minRep = minRep;
        this.maxRep = maxRep;
        this.tempDescanso = tempDescanso;
        this.serieExerc = serieExerc;
        this.observacoes = observacoes;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
}
