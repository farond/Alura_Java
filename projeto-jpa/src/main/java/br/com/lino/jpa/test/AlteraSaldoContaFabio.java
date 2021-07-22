package br.com.lino.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.lino.jpa.model.Conta;

public class AlteraSaldoContaFabio {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta contaDoFabio = em.find(Conta.class, 1L);
		//System.out.println("Conta Fabio -> " + contaDoFabio.getTitular());
		
		em.getTransaction().begin();
		
		contaDoFabio.setSaldo(220.0);
		
		em.getTransaction().commit();
		
		
		
		
	}

}
