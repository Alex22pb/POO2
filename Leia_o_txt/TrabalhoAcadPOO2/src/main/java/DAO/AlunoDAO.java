/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DOMAIN.Aluno;
import dao.ConexaoHibernate;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * Classes que usaram banco de dados
 */
public class AlunoDAO extends GenericDAO{
    
//    private List<Aluno> pesquisar(String pesq, Class classe) throws HibernateException {
//
//        List lista = null;        
//        Session sessao = null;
//        
//        try {
//            sessao = ConexaoHibernate.getSessionFactory().openSession();
//            sessao.beginTransaction();
//
//            CriteriaBuilder builder = sessao.getCriteriaBuilder();
//            CriteriaQuery consulta = builder.createQuery(classe);
//            Root tabela = consulta.from(classe);            
// 
//            Predicate restricoes = builder.like(tabela.get("nome") , pesq + '%' ); 
//                       
//            consulta.where(restricoes);
//            
//            lista = sessao.createQuery(consulta).getResultList();            
//            
//            sessao.getTransaction().commit();
//            sessao.close();
//        } catch ( HibernateException ex) {
//            if ( sessao != null) {
//                sessao.getTransaction().rollback();
//                sessao.close();
//            }
//            throw new HibernateException(ex);
//        }           
//        return lista;  
//    }
    
    
}
