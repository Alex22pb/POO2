/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * Classe do usuario, para poder entrar no sistema
 */
@Entity
public class Personal implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonal;
    
    @OneToMany(mappedBy = "personal", cascade = CascadeType.ALL)
    private List<Aluno> aluno = new ArrayList<>();
        
    @Column(length = 60, nullable = false) 
    private String nome;
    
    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNasc;
    
    @Column(updatable = false, length = 20, nullable = false)
    private String cpf;
    
    @Column (length = 20)
    private String telefone;
    
    @Lob
    private byte[] foto;

    @Column(length = 100)
    private String eMail;
    
    @Column(length = 1)
    private char sexo;
    
    @Column(length = 20)
    private String numeracaoCREF;

    public Personal(int idPersonal, String nome, Date dateNasc, String cpf, String telefone, byte[] foto, String eMail, char sexo, String numeracaoCREF) {
        this.idPersonal = idPersonal;
        this.nome = nome;
        this.dateNasc = dateNasc;
        this.cpf = cpf;
        this.telefone = telefone;
        this.foto = foto;
        this.eMail = eMail;
        this.sexo = sexo;
        this.numeracaoCREF = numeracaoCREF;
    }

    public Personal(String nome, Date dateNasc, String cpf, String telefone, byte[] foto, String eMail, char sexo, String numeracaoCREF) {
        this.nome = nome;
        this.dateNasc = dateNasc;
        this.cpf = cpf;
        this.telefone = telefone;
        this.foto = foto;
        this.eMail = eMail;
        this.sexo = sexo;
        this.numeracaoCREF = numeracaoCREF;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNumeracaoCREF() {
        return numeracaoCREF;
    }

    public void setNumeracaoCREF(String numeracaoCREF) {
        this.numeracaoCREF = numeracaoCREF;
    }
}
