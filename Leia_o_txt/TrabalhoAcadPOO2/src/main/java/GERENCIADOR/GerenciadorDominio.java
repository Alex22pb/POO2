/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GERENCIADOR;

import DAO.AlunoDAO;
import DAO.FichaAlunoDAO;
import DAO.GenericDAO;
import DAO.PersonalDAO;
import DOMAIN.Aluno;
import DOMAIN.Exercicios;
import DOMAIN.FichaAluno;
import DOMAIN.Endereco;
import DOMAIN.Pagamento;
import DOMAIN.Personal;
import DOMAIN.Usuario;
import dao.ConexaoHibernate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import org.hibernate.HibernateException;

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
    private PersonalDAO personal_DAO;
    private GenericDAO generic_DAO;
  
    public GerenciadorDominio(){
        ConexaoHibernate.getSessionFactory();
        
        aluno_DAO = new AlunoDAO();
        fichaAluno_DAO = new FichaAlunoDAO();
        personal_DAO = new PersonalDAO();
        generic_DAO = new GenericDAO();
    }   
   
     public Usuario inserirUsuario(String nome, Date dataNasc, String cpf, String telefone, String userName, String senha){
        
        Usuario user = new Usuario (userName, senha, dataNasc, nome, cpf, telefone);
                
        generic_DAO.cadastrar(user);
        
        return user;
    }
    
    public Aluno inserirAluno(String nome, Date dataNasc, String cpf, String cep, String cidade, String bairro, String rua, 
            String email, String telefone, Icon foto, char sexo, boolean jaTreinou, String plano, int diaVencimento, Date dataCadastro, Personal perso){
        
        Aluno alu = new Aluno (perso, nome, cpf, dataNasc, sexo, telefone, email, jaTreinou, plano, dataCadastro, 
                diaVencimento, FuncaoAjuda.IconToBytes(foto), cep, bairro, rua, cidade);
        
        generic_DAO.cadastrar(alu);
        
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
        alu.setFoto(FuncaoAjuda.IconToBytes(foto));
        alu.setSexo(sexo);
        alu.setJaTreinou(jaTreinou);
        alu.setTipoPlano(plano);
        alu.setDiaDoVencimento(diaVencimento);
        
        generic_DAO.alterar(alu);
        return alu;
    }
    
    public List<Aluno> listarAlunos(Class classe) throws HibernateException{ 
        return generic_DAO.listar(classe);
    }
    
    public List<Personal> listarPersonal(Class classe) throws HibernateException{ 
        return generic_DAO.listar(classe);
    }
    
    public Personal inserirPersonal(String nome, Date dataNasc, String cpf, String telefone, Icon foto, String email, char sexo, String cref){
               
        Personal perso = new Personal (nome, dataNasc, cpf, telefone, FuncaoAjuda.IconToBytes(foto), email, sexo, cref);;
        
        generic_DAO.cadastrar(perso);
        
        return perso;
    }
    
    public Personal alterarPersonal(Personal perso, String nome, String cpf, String telefone, Icon foto, String email, String cref){
       
       perso.setNome(nome);
       perso.setCpf(cpf);
       perso.setTelefone(telefone);
       perso.setFoto(FuncaoAjuda.IconToBytes(foto));
       perso.seteMail(email);
       perso.setNumeracaoCREF(cref);
       
        
       generic_DAO.alterar(perso);
        
       return perso; 
    }
    
    public List<FichaAluno> listarFicha(Class classe) throws HibernateException{ 
        return generic_DAO.listar(classe);
    }
    
    public FichaAluno inserirFicha(Aluno alu, String obj, List<Exercicios> listExer, double pocentoGord, double peso, double altura, int minRep, int maxRep, int descanso, int quantSerie, Date data, String obs){
        FichaAluno ficha = new FichaAluno(alu, obj, listExer, pocentoGord, peso, altura, minRep, maxRep, descanso, quantSerie, data, obs);
        
        generic_DAO.cadastrar(ficha);
        
        return ficha;
    }
    
    public FichaAluno alterarFicha(FichaAluno ficha, String obj, List<Exercicios> listExer, double pocentoGord, double peso, double altura, int minRep, int maxRep, int descanso, int quantSerie, String obs){
        
        ficha.setTipoFicha(obj);
        ficha.setExercicios(listExer);
        ficha.setPorcentagemGordura(pocentoGord);
        ficha.setPeso(peso);
        ficha.setAltura(altura);
        ficha.setMinRep(minRep);
        ficha.setMaxRep(maxRep);
        ficha.setTempDescanso(descanso);
        ficha.setSerieExerc(quantSerie);
        ficha.setObservacoes(obs);
        
        generic_DAO.alterar(ficha);
        
        return ficha;
    }
    
    public Exercicios inserirExercicios(Exercicios exerc) throws HibernateException{ 
        
        generic_DAO.cadastrar(exerc);
        
        return exerc;
    }
    
    public List<Exercicios> listarExercicios(Class classe) throws HibernateException{ 
        return generic_DAO.listar(classe);
    }
    
    public void excluir (Object obj) throws HibernateException{
        generic_DAO.excluir(obj);
    }
    
     public Pagamento inserirPagamento(Aluno alu, double valor, Date data){
        
        Pagamento pagar = new Pagamento (alu, valor, data);
        
        generic_DAO.cadastrar(pagar);
        
        return pagar;
    }
    
    public List<Pagamento> listarPagamento(Class classe) throws HibernateException{ 
        return generic_DAO.listar(classe);
    }
    
    public static FichaAluno fichaPredefinida(String tipo, List<Exercicios> listaExerc) {
        
        List<Exercicios> exerc = new ArrayList<>(); // Inicializa a lista corretamente
        int minRep = 0, maxRep = 0, temDesc = 0, serieExer = 0;
        String obs = null;

        switch (tipo) {
            case "Emagrecimento":
                exerc.add(FuncaoAjuda.buscarExercicio("Agachamento Livre", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Sulpino Reto com Halteres", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Remada Baixa", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Afundo Alternado", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Desenvolvimento Ombro", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Prancha Abdominal", listaExerc));
                minRep = 12;
                maxRep = 15;
                temDesc = 30;
                serieExer = 3;
                obs = "Pode intercalar com exercícios aeróbicos (40s de prancha).";
                break;
            case "Hipertrofia":
                exerc.add(FuncaoAjuda.buscarExercicio("Agachamento Livre", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Leg Press 45°", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Sulpino Reto Barra", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Crucifixo Máquina", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Rosca Direta", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Tríceps Corda", listaExerc));
                minRep = 8;
                maxRep = 12;
                temDesc = 60;
                serieExer = 4;
                obs = "Aumentar a carga gradativamente e manter boa execução dos movimentos.";
                break;
            case "Força/Potência":
                exerc.add(FuncaoAjuda.buscarExercicio("Levantamento Terra", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Agachamento Livre", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Sulpino Reto Barra", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Desenvolvimento Ombro", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Barra Fixa", listaExerc));
                exerc.add(FuncaoAjuda.buscarExercicio("Prancha Abdominal", listaExerc));
                minRep = 4;
                maxRep = 6;
                temDesc = 120;
                serieExer = 5;
                obs = "Foco na execução para evitar lesões (40s de prancha).";
                break;
        }

        return new FichaAluno(0 , null, tipo, exerc, 0, 0, 0, minRep, maxRep, temDesc, serieExer, null, obs);
    }
   
}
