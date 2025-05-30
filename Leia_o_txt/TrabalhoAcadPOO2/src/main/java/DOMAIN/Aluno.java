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
 * Classe do aluno, todo o aluno e criado com o myFicha null, para depois criar
 * uma ficha para ele e associar ela
 */
@Entity
public class Aluno implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdAluno;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Personal")
    private Personal personal;

    @Column(length = 200)
    private String nome;

    @Column(updatable = false, length = 20, nullable = false)
    private String cpf;

    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNasc;

    @Column(length = 1)
    private char sexo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco; //ERRO
    
    @Column (length = 20)
    private String telefone;

    @Column(length = 100)
    private String eMail;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<FichaAluno> ficha = new ArrayList<>();
    
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Pagamento> pagamentos = new ArrayList<>();

    @Column(nullable = false)
    private boolean jaTreinou;

    @Column(length = 20)
    private String tipoPlano;
    
    @Temporal(TemporalType.DATE)
    private Date dataCadastroAluno;
    
    private int diaDoVencimento;

    @Lob
    private byte[] foto;

    public Aluno() {
    }

    public Aluno(int IdAluno, Personal personal, String nome, String cpf, Date dataNasc, char sexo, String telefone, 
            String eMail, boolean jaTreinou, String tipoPlano, Date dataCadastroAluno, int diaDoVencimento, 
            byte[] foto, int idEndereco, String cep, String bairro, String endereco, String cidade) {
        this.IdAluno = IdAluno;
        this.personal = personal;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.endereco = new Endereco(idEndereco, cep, bairro, endereco, cidade);
        this.endereco.setAluno(this);
        this.telefone = telefone;
        this.eMail = eMail;
        this.jaTreinou = jaTreinou;
        this.tipoPlano = tipoPlano;
        this.dataCadastroAluno = dataCadastroAluno;
        this.diaDoVencimento = diaDoVencimento;
        this.foto = foto;
    }
    
    public Aluno(Personal personal, String nome, String cpf, Date dataNasc, char sexo, String telefone, 
            String eMail, boolean jaTreinou, String tipoPlano, Date dataCadastroAluno, int diaDoVencimento, 
            byte[] foto, String cep, String bairro, String endereco, String cidade) {
        this.personal = personal;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.endereco = new Endereco(cep, bairro, endereco, cidade);
        this.endereco.setAluno(this);
        this.telefone = telefone;
        this.eMail = eMail;
        this.jaTreinou = jaTreinou;
        this.tipoPlano = tipoPlano;
        this.dataCadastroAluno = dataCadastroAluno;
        this.diaDoVencimento = diaDoVencimento;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public List<FichaAluno> getFicha() {
        return ficha;
    }

    public void setFicha(List<FichaAluno> ficha) {
        this.ficha = ficha;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
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

    public Date getDataCadastroAluno() {
        return dataCadastroAluno;
    }

    public void setDataCadastroAluno(Date dataCadastroAluno) {
        this.dataCadastroAluno = dataCadastroAluno;
    }

    public int getDiaDoVencimento() {
        return diaDoVencimento;
    }

    public void setDiaDoVencimento(int diaDoVencimento) {
        this.diaDoVencimento = diaDoVencimento;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }  
    
     public String toString() {
        return this.nome;
    }
}
