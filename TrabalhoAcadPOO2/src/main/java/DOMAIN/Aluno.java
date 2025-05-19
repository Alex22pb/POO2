/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Classe do aluno, todo o aluno e criado com o myFicha null, para depois criar
 * uma ficha para ele e associar ela
 */
@Entity
public class Aluno implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdAluno;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Personal", referencedColumnName = "idPersonal")
    private  Personal personal;

    @Column(length = 200)
    private String nome;

    @Column(updatable = false, length = 14, nullable = false)
    private String cpf;

    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNasc;

    @Column(length = 1)
    private char sexo;

    @Column(nullable = false)
    private double peso;

    @Column(nullable = false)
    private double altura;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Column(length = 100)
    private String eMail;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    private FichaAluno myFicha;

    @Column(nullable = false)
    private boolean jaTreinou;

    @Column(length = 20)
    private String tipoPlano;

    @Lob
    private byte[] foto;

    public Aluno(int IdAluno, Personal personal, String nome, String cpf, Date dataNasc, char sexo, double peso, double altura, Endereco endereco, String eMail, FichaAluno myFicha, boolean jaTreinou, String tipoPlano, byte[] foto) {
        this.IdAluno = IdAluno;
        this.personal = personal;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.endereco = endereco;
        this.eMail = eMail;
        this.myFicha = myFicha;
        this.jaTreinou = jaTreinou;
        this.tipoPlano = tipoPlano;
        this.foto = foto;
    }

    public int getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(int IdAluno) {
        this.IdAluno = IdAluno;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public FichaAluno getMyFicha() {
        return myFicha;
    }

    public void setMyFicha(FichaAluno myFicha) {
        this.myFicha = myFicha;
    }

    public boolean isJaTreinou() {
        return jaTreinou;
    }

    public void setJaTreinou(boolean jaTreinou) {
        this.jaTreinou = jaTreinou;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
  
}
