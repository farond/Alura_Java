package br.com.linobank.banco.test.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.linobank.banco.model.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc.getTitular());
		System.out.println(cc.getSaldo());

	}

}
