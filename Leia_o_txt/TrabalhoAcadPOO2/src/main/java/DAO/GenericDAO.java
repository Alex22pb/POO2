/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DOMAIN.Personal;
import dao.ConexaoHibernate;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author 2022222760020
 */
public class GenericDAO {

    public GenericDAO() {
    }
        
    public void cadastrar(Object obj) throws HibernateException{
        Session sessao = null;
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();
            
            sessao.save(obj);
            
            sessao.getTransaction().commit();
            sessao.close();
        }catch(HibernateException ex){
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }  
    }
    
    public void excluir(Object obj) throws HibernateException{
        Session sessao = null;
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();
            
            sessao.save(obj);
            
            sessao.getTransaction().commit();
            sessao.close();
        }catch(HibernateException ex){
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }  
    }
    
    public void alterar(Object obj) throws HibernateException{
        Session sessao = null;
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();
            
            sessao.save(obj);
            
            sessao.getTransaction().commit();
            sessao.close();
        }catch(HibernateException ex){
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }  
    }
    
    public List listar (Class classe) throws HibernateException{
        Session sessao = null;
        List lista = null;
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();
            
            CriteriaQuery consulta =  sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from(classe);
            lista = sessao.createQuery(consulta).getResultList();
            
            sessao.getTransaction().commit();
            sessao.close();
        }catch(HibernateException ex){
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        
        return lista;
    }
}
