/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author 2022222760020
 */
@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pagamento;
    
    @ManyToOne
    @JoinColumn(name = "id_aluno", nullable = false)
    private Aluno aluno;
    
    private double valorPagamento;
    private Date diaPagamento;

    public Pagamento(int id_pagamento, Aluno aluno, double valorPagamento, Date diaPagamento) {
        this.id_pagamento = id_pagamento;
        this.aluno = aluno;
        this.valorPagamento = valorPagamento;
        this.diaPagamento = diaPagamento;
    }

    public Pagamento(Aluno aluno, double valorPagamento, Date diaPagamento) {
        this.aluno = aluno;
        this.valorPagamento = valorPagamento;
        this.diaPagamento = diaPagamento;
    }
    
    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public Date getDiaPagamento() {
        return diaPagamento;
    }

    public void setDiaPagamento(Date diaPagamento) {
        this.diaPagamento = diaPagamento;
    }

}
