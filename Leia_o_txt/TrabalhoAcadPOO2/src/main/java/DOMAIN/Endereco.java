/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEndereco;
    
    @Column(length = 10)
    private String cep;
    
    @Column(length = 50)
    private String bairro;
    
    @Column(length = 100)
    private String rua;
    
    @Column(length = 50)
    private String cidade;
    
    private Aluno aluno;
    
    public Endereco(){
    
    }

    public Endereco(int idEndereco, String cep, String bairro, String endereco, String cidade) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = endereco;
        this.cidade = cidade;
    }
    
    public Endereco(String cep, String bairro, String endereco, String cidade) {
        this.cep = cep;
        this.bairro = bairro;
        this.rua = endereco;
        this.cidade = cidade;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String endereco) {
        this.rua = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 
}
