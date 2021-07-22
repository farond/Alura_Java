package br.com.lino.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.lino.jpa.model.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
		// Transient
		Conta conta = new Conta();
		conta.setTitular("Jose");
		conta.setAgencia(6541);
		conta.setNumero(32165);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Transient -> Managed
		em.persist(conta);
		
		//Maged -> Removed
		em.remove(conta);
		em.getTransaction().commit();

	}

}
