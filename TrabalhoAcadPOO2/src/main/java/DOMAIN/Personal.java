/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

/**
 *
 * Classe do usuario, para poder entrar no sistema
 */
public class Personal {
    private String userName;
    private String senha;
    private String nome;
    private String dateNasc;
    private String cpf;
    private String telefone;

    public Personal(String userName, String senha, String nome, String dateNasc, String cpf, String telefone) {
        this.userName = userName;
        this.senha = senha;
        this.nome = nome;
        this.dateNasc = dateNasc;
        this.cpf = cpf;
        this.telefone = telefone;
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

    public String getDateNasc() {
        return dateNasc;
    }

    public void setDateNasc(String dateNasc) {
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
