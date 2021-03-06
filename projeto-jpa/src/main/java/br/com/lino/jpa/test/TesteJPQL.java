package br.com.lino.jpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.lino.jpa.model.Conta;
import br.com.lino.jpa.model.Movimentacao;

//importações omitidas

public class TesteJPQL {
  public static void main(String[] args) {

      EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
      EntityManager em = emf.createEntityManager();

      String sql = "select m from Movimentacao m where m.conta = :pConta order by m.valor desc";

      Conta conta = new Conta();
      conta.setId(2L);
      TypedQuery<Movimentacao> query = em.createQuery(sql, Movimentacao.class);
      query.setParameter("pConta", conta);

      List<Movimentacao> movimentacoes = query.getResultList();
      for (Movimentacao movimentacao : movimentacoes) {
          System.out.println("Descrição: " + movimentacao.getDescricao());
          System.out.println("Valor: " + movimentacao.getValor());
          System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
      }
  }
}
