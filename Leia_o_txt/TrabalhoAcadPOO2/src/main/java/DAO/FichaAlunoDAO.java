/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DOMAIN.Aluno;
import DOMAIN.FichaAluno;
import dao.ConexaoHibernate;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * Classes que usaram banco de dados
 */
public class FichaAlunoDAO extends GenericDAO{
    
//    public List<FichaAluno> listarFichadoAluno(int pesq) throws HibernateException {
//        List list = null;
//        Session sessao = null;
//
//        try {
//            sessao = ConexaoHibernate.getSessionFactory().openSession();
//            sessao.beginTransaction();
//
//            CriteriaBuilder builder = sessao.getCriteriaBuilder();
//            CriteriaQuery consulta = builder.createQuery(FichaAluno.class);
//            Root tabela = consulta.from(FichaAluno.class);
//
//            // Restrição: onde o id do aluno da ficha seja igual ao id passado
//            Predicate restricoes = builder.equal(tabela.get("aluno").get("IdAluno"), pesq);
//            consulta.where(restricoes);
//
//            list = sessao.createQuery(consulta).getResultList();
//
//            sessao.getTransaction().commit();
//        } catch (HibernateException ex) {
//            if (sessao != null) {
//                sessao.getTransaction().rollback();
//            }
//            throw new HibernateException(ex);
//        } finally {
//            if (sessao != null) {
//                sessao.close();
//            }
//        }
//        return list;
//    }
}
