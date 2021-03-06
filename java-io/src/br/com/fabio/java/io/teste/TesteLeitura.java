package br.com.fabio.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com um Arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		//FileInputStream fis = new FileInputStream("lorem.txt");
		//InputStreamReader isr = new InputStreamReader(fis);	
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha= br.readLine();
		}
		
		
		br.close();

	}

}
