/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import java.io.Serializable;

// classe do endereco
public class endereco implements Serializable{
    
    private int idEndereco;
    private String cep;
    private String bairro;
    private String endereco;
    private String cidade;
    
    public endereco(){
    
    }

    public endereco(int idEndereco, String cep, String bairro, String endereco, String cidade) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.bairro = bairro;
        this.endereco = endereco;
        this.cidade = cidade;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 
}
