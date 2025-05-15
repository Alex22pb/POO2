/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

/**
 *
 * @author 2022222760020
 */
public class Exercicios {
    private String nomeExercicio;

    public Exercicios(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
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
