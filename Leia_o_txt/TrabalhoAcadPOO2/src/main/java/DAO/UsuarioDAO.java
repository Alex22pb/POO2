/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DOMAIN.Usuario;
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
 * @author User
 */
public class UsuarioDAO extends GenericDAO{
    
        public boolean pesquisarUsuario(String nome, String senha) throws HibernateException {
      
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Usuario.class);
            Root tabela = consulta.from(Usuario.class);            
 
            Predicate restricoes = builder.and(builder.equal(tabela.get("userName"), nome), builder.equal(tabela.get("senha"), senha)); 
            
            consulta.where(restricoes);  
            
            List<Usuario> resultado = sessao.createQuery(consulta).getResultList();
            
            sessao.getTransaction().commit();
            sessao.close();
            return !resultado.isEmpty();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }            
    }
        
    public boolean verificarUsername(String nome) throws HibernateException {
      
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Usuario.class);
            Root tabela = consulta.from(Usuario.class);            
 
            Predicate restricoes = builder.equal(tabela.get("userName"), nome);
            
            consulta.where(restricoes);  
            
            List<Usuario> resultado = sessao.createQuery(consulta).getResultList();
            
            sessao.getTransaction().commit();
            sessao.close();
            return !resultado.isEmpty();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }            
    }
}
