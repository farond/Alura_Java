package br.com.lino.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.lino.jpa.model.Conta;


public class CriaConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Maria");
		conta.setNumero(3345);
		conta.setAgencia(4122);
		
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		conta.setSaldo(1500.0);
		
		em.getTransaction().commit();
		
		
		
		
		EntityManager em2 = emf.createEntityManager();
		
		conta.setSaldo(500.0);
		
		em2.getTransaction().begin();
		
		em2.merge(conta);
		
		em2.getTransaction().commit();
		em2.close();

	}

}
