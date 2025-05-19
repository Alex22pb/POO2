/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * Classe do usuario, para poder entrar no sistema
 */
@Entity
public class Personal implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonal;
    
    @OneToMany(mappedBy = "personal")
    private Aluno aluno;
    
    @Column(length = 30, nullable = false)
    private String userName;
    
    @Column(length = 60, nullable = false) 
    private String senha;
    
    @Column(length = 60, nullable = false) 
    private String nome;
    
    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNasc;
    
    @Column(updatable = false, length = 14, nullable = false)
    private String cpf;
    
    @Column (length = 11)
    private String telefone;

    public Personal(int idPersonal, String userName, String senha, String nome, Date dateNasc, String cpf, String telefone) {
        this.idPersonal = idPersonal;
        this.userName = userName;
        this.senha = senha;
        this.nome = nome;
        this.dateNasc = dateNasc;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDateNasc() {
        return dateNasc;
    }

    public void setDateNasc(Date dateNasc) {
        this.dateNasc = dateNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
