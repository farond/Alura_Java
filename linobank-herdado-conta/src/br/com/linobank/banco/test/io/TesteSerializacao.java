package br.com.linobank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.linobank.banco.model.Cliente;
import br.com.linobank.banco.model.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fabio");
		cliente.setProfissao("Programador Trainee");
		cliente.setCpf("44444444488");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		//String nome = "Fabio Lino";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));			
		oos.writeObject(cc);
		oos.close();

	}

}
