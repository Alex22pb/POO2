/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 2022222760020
 */
@Entity
public class Exercicios implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false, unique = true)
    private String nomeExercicio;
    
    @ManyToMany (mappedBy = "exercicios")
    private List<FichaAluno> fichaAlunos;

    public Exercicios(int id, String nomeExercicio, List<FichaAluno> fichaAlunos) {
        this.id = id;
        this.nomeExercicio = nomeExercicio;
        this.fichaAlunos = fichaAlunos;
    }
    
    public Exercicios( String nomeExercicio, List<FichaAluno> fichaAlunos) {
        this.nomeExercicio = nomeExercicio;
        this.fichaAlunos = fichaAlunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public List<FichaAluno> getFichaAlunos() {
        return fichaAlunos;
    }

    public void setFichaAlunos(List<FichaAluno> fichaAlunos) {
        this.fichaAlunos = fichaAlunos;
    }

    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exercicios)) return false;
        Exercicios that = (Exercicios) o;
        return nomeExercicio != null && nomeExercicio.equalsIgnoreCase(that.nomeExercicio);
    }

    @Override
    public int hashCode() {
        return nomeExercicio != null ? nomeExercicio.toLowerCase().hashCode() : 0;
    }
}
