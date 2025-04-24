/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

/**
 Classe do aluno, todo o aluno e criado com o myFicha null, para depois criar uma ficha para ele e associar ela 
 */
public class Aluno {
    private String nome;
    private String cpf;
    private String dataNasc;
    private String sexo;
    private double peso;
    private double altura;
    private String cidade;
    private String rua;
    private String bairro;
    private String eMail;
    private FichaAluno myFicha = null;
    private boolean jaTreinou;
    private String tipoPlano;

    public Aluno(String nome, String cpf, String dataNasc, String sexo, double peso, double altura, String cidade, String rua, String bairro, String eMail, boolean jaTreinou, String tipoPlano) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.eMail = eMail;
        this.jaTreinou = jaTreinou;
        this.tipoPlano = tipoPlano;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
    
    public boolean isJaTreinou() {
        return jaTreinou;
    }

    public void setJaTreinou(boolean jaTreinou) {
        this.jaTreinou = jaTreinou;
    }

    public FichaAluno getMyFicha() {
        return myFicha;
    }

    public void setMyFicha(FichaAluno myFicha) {
        this.myFicha = myFicha;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
   
    
    
}
