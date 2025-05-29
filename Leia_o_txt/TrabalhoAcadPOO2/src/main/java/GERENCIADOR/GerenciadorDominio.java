/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GERENCIADOR;

import DAO.AlunoDAO;
import DAO.ExerciciosDAO;
import DAO.FichaAlunoDAO;
import DAO.GenericDAO;
import DAO.PersonalDAO;
import DAO.enderecoDAO;
import DOMAIN.Aluno;
import DOMAIN.Exercicios;
import DOMAIN.FichaAluno;
import DOMAIN.Endereco;
import DOMAIN.Personal;
import dao.ConexaoHibernate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;

/**
 *
 * @author User
 */
public class GerenciadorDominio {
    
//    A ideia é que na hora da ficha ser criada, ao selecionar o objetivo do aluno ela ja set oq o aluno tem que fazer,
//    quais exercicios, quantidade de repetições, tempo de descanso, porém não sei dizer se essa vai ser a melhor maneira para se fazer isso.
//     Pois se modificar algo, o objetivo do aluno poderá não ser alcançado. Também não sei se essa classe foi criada/sendo usada da maneira correta.
    
    private AlunoDAO aluno_DAO;
    private FichaAlunoDAO fichaAluno_DAO;
    private enderecoDAO endereco_DAO;
    private PersonalDAO personal_DAO;
    private ExerciciosDAO exercicio_DAO;
    private GenericDAO generic_DAO;
  
    public GerenciadorDominio(){
        ConexaoHibernate.getSessionFactory();
        
        aluno_DAO = new AlunoDAO();
        fichaAluno_DAO = new FichaAlunoDAO();
        endereco_DAO = new enderecoDAO();
        personal_DAO = new PersonalDAO();
        exercicio_DAO = new ExerciciosDAO();
        generic_DAO = new GenericDAO();
    }   
   
    public Aluno inserirAluno(String nome, Date dataNasc, String cpf, String cep, String cidade, String bairro, String rua, 
            String email, String telefone, Icon foto, char sexo, boolean jaTreinou, String plano, int diaVencimento, Date dataCadastro, Personal perso){
        
        Aluno alu = new Aluno (perso, nome, cpf, dataNasc, sexo, telefone, email, jaTreinou, plano, dataCadastro, 
                diaVencimento, FuncaoAjuda.IconToBytes(foto), cep, bairro, rua, cidade);
        
        aluno_DAO.cadastrar(alu);
        
        return alu;
    }
            
    public Aluno alterarAluno(Aluno alu, String nome, Date dataNasc, String cpf, String cep, String cidade, String bairro, String rua, 
            String email, String telefone, Icon foto, char sexo, boolean jaTreinou, String plano, int diaVencimento){
     
        alu.setNome(nome);
        alu.setCpf(cpf);
        alu.getEndereco().setCep(cep);
        alu.getEndereco().setCidade(cidade);
        alu.getEndereco().setBairro(bairro);
        alu.getEndereco().setRua(rua);
        alu.seteMail(email);
        alu.setTelefone(telefone);
        alu.setFoto(FuncaoAjuda.IconToBytes(foto) );
        alu.setSexo(sexo);
        alu.setJaTreinou(jaTreinou);
        alu.setTipoPlano(plano);
        alu.setDiaDoVencimento(diaVencimento);
        
        aluno_DAO.alterar(alu);
        return alu;
    }
    
    
    public static FichaAluno fichaPredefinida(String tipo) {
        
        List<Exercicios> exerc = new ArrayList<>(); // Inicializa a lista corretamente
        int minRep = 0, maxRep = 0, temDesc = 0, serieExer = 0;
        String obs = null;

        switch (tipo) {
            case "Emagrecimento":
                exerc.add(new Exercicios(0,"Agachamento Livre", null));
                exerc.add(new Exercicios(1,"Sulpino Reto com Halteres",null));
                exerc.add(new Exercicios(2,"Remada Baixa",null));
                exerc.add(new Exercicios(3,"Afundo Alternado", null));
                exerc.add(new Exercicios(4,"Desenvolvimento Ombro", null));
                exerc.add(new Exercicios(5,"Prancha Abdominal", null));
                minRep = 12;
                maxRep = 15;
                temDesc = 30;
                serieExer = 3;
                obs = "Pode intercalar com exercícios aeróbicos (40s de prancha).";
                break;
            case "Hipertrofia":
                exerc.add(new Exercicios(0,"Agachamento Livre", null));
                exerc.add(new Exercicios(6,"Leg Press 45°", null));
                exerc.add(new Exercicios(7,"Sulpino Reto Barra", null));
                exerc.add(new Exercicios(8,"Crucifixo Máquina", null));
                exerc.add(new Exercicios(9,"Rosca Direta", null));
                exerc.add(new Exercicios(10,"Tríceps Corda", null));
                minRep = 8;
                maxRep = 12;
                temDesc = 60;
                serieExer = 4;
                obs = "Aumentar a carga gradativamente e manter boa execução dos movimentos.";
                break;
            case "Força/Potência":
                exerc.add(new Exercicios(11,"Levantamento Terra", null));
                exerc.add(new Exercicios(0,"Agachamento Livre", null));
                exerc.add(new Exercicios(7,"Sulpino Reto Barra",null));
                exerc.add(new Exercicios(4,"Desenvolvimento Ombro", null));
                exerc.add(new Exercicios(12,"Barra Fixa", null));
                exerc.add(new Exercicios(5,"Prancha Abdominal", null));
                minRep = 4;
                maxRep = 6;
                temDesc = 120;
                serieExer = 5;
                obs = "Foco na execução para evitar lesões (40s de prancha).";
                break;
        }

        return new FichaAluno(0 , null, tipo, exerc,0 , 0, 0, minRep, maxRep, temDesc, serieExer, obs);
    }
   
}
