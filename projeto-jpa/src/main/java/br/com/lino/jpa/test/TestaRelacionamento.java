package br.com.lino.jpa.test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.lino.jpa.model.Conta;
import br.com.lino.jpa.model.Movimentacao;
import br.com.lino.jpa.model.TipoMovimentacao;

public class TestaRelacionamento {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia(9874);
		conta.setNumero(6541);
		conta.setSaldo(600.0);
		conta.setTitular("Tonico");
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("Mercado");
		movimentacao.setValor(new BigDecimal(400.0));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setConta(conta);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.persist(movimentacao);
		em.getTransaction().commit();
		
		em.close();
		
		

	}

}
