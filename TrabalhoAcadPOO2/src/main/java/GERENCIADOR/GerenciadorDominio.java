/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GERENCIADOR;

import DAO.AlunoDAO;
import DAO.FichaAlunoDAO;
import DAO.PersonalDAO;
import DAO.enderecoDAO;
import DOMAIN.Exercicios;
import DOMAIN.FichaAluno;
import DOMAIN.endereco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
  
    public GerenciadorDominio() {
        aluno_DAO = new AlunoDAO();
        fichaAluno_DAO = new FichaAlunoDAO();
        endereco_DAO = new enderecoDAO();
        personal_DAO = new PersonalDAO();
    }
    
    public static FichaAluno fichaPredefinida(String tipo) {
        List<Exercicios> exerc = new ArrayList<>(); // Inicializa a lista corretamente
        int minRep = 0, maxRep = 0, temDesc = 0, serieExer = 0;
        String obs = null;

        switch (tipo) {
            case "Emagrecimento":
                exerc.add(new Exercicios("Agachamento Livre"));
                exerc.add(new Exercicios("Sulpino Reto com Halteres"));
                exerc.add(new Exercicios("Remada Baixa"));
                exerc.add(new Exercicios("Afundo Alternado"));
                exerc.add(new Exercicios("Desenvolvimento Ombro"));
                exerc.add(new Exercicios("Prancha Abdominal"));
                minRep = 12;
                maxRep = 15;
                temDesc = 30;
                serieExer = 3;
                obs = "Pode intercalar com exercícios aeróbicos (40s de prancha).";
                break;
            case "Hipertrofia":
                exerc.add(new Exercicios("Agachamento Livre"));
                exerc.add(new Exercicios("Leg Press 45°"));
                exerc.add(new Exercicios("Sulpino Reto Barra"));
                exerc.add(new Exercicios("Crucifixo Máquina"));
                exerc.add(new Exercicios("Rosca Direta"));
                exerc.add(new Exercicios("Tríceps Corda"));
                minRep = 8;
                maxRep = 12;
                temDesc = 60;
                serieExer = 4;
                obs = "Aumentar a carga gradativamente e manter boa execução dos movimentos.";
                break;
            case "Força/Potência":
                exerc.add(new Exercicios("Levantamento Terra"));
                exerc.add(new Exercicios("Agachamento Livre"));
                exerc.add(new Exercicios("Sulpino Reto Barra"));
                exerc.add(new Exercicios("Desenvolvimento Ombro"));
                exerc.add(new Exercicios("Barra Fixa"));
                exerc.add(new Exercicios("Prancha Abdominal"));
                minRep = 4;
                maxRep = 6;
                temDesc = 120;
                serieExer = 5;
                obs = "Foco na execução para evitar lesões (40s de prancha).";
                break;
        }

        return new FichaAluno(tipo, exerc, minRep, maxRep, temDesc, serieExer, obs);
    }
   
}
