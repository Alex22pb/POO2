/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author User
 */
@Entity
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    
    @Column(length = 30, nullable = false)
    private String userName;
    
    @Column(length = 60, nullable = false) 
    private String senha;
    
    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNasc;
    
    @Column(length = 60, nullable = false) 
    private String nome;
    
    @Column(updatable = false, length = 20, nullable = false)
    private String cpf;
    
    @Column (length = 20)
    private String telefone;

    public Usuario(int idUsuario, String userName, String senha, Date dateNasc, String nome, String cpf, String telefone) {
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.senha = senha;
        this.dateNasc = dateNasc;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Usuario(String userName, String senha, Date dateNasc, String nome, String cpf, String telefone) {
        this.userName = userName;
        this.senha = senha;
        this.dateNasc = dateNasc;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public Date getDateNasc() {
        return dateNasc;
    }

    public void setDateNasc(Date dateNasc) {
        this.dateNasc = dateNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
