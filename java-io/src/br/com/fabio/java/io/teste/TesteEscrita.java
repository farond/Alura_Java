package br.com.fabio.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com um Arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Ol? pessoal, testando a escrita em java usando um arquivo.txt");
		bw.newLine();
		bw.newLine();
		bw.write("Outra linha de teste hehehehe");
		
		
		
			
		
		bw.close();

	}

}
