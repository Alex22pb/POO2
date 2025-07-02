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
import java.time.LocalDate;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * Classes que usaram banco de dados
 */
public class AlunoDAO extends GenericDAO {

    public List<Aluno> buscarAniversariantesDoMesAtual(Class classe) throws HibernateException {
        List<Aluno> lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            int mesAtual = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH) + 1;

            String sql = "SELECT * FROM aluno WHERE EXTRACT(MONTH FROM datanasc) = :mes";
            Query query = sessao.createNativeQuery(sql, Aluno.class);
            query.setParameter("mes", mesAtual);

            lista = query.getResultList();

            sessao.getTransaction().commit();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(ex);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }

        return lista;
    }

    public List<Aluno> listarAlunosInadimplentesDoMes() throws HibernateException {
        Session sessao = null;
        List<Aluno> lista = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            String sql = """
                SELECT *
                FROM aluno a
                WHERE CURRENT_DATE >= DATE_TRUNC('month', CURRENT_DATE) + (a.diadovencimento - 1) * INTERVAL '1 day'
                  AND NOT EXISTS (
                    SELECT 1
                    FROM pagamento p
                    WHERE p.id_aluno = a.idaluno
                      AND EXTRACT(MONTH FROM p.diapagamento) = EXTRACT(MONTH FROM CURRENT_DATE)
                      AND EXTRACT(YEAR FROM p.diapagamento) = EXTRACT(YEAR FROM CURRENT_DATE)
                  );
            """;

            lista = sessao.createNativeQuery(sql, Aluno.class).getResultList();

            sessao.getTransaction().commit();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            // Aqui você pode optar por logar o erro, mas não lançar se não quiser interromper a aplicação
            throw new HibernateException(ex);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }

        return lista;
    }

}
