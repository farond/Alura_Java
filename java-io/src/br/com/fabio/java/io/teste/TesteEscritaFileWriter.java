package br.com.fabio.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {
	
public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com um Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw  = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
	
		long ini = System.currentTimeMillis();

	
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));		
		bw.write("Ol? pessoal, testando a escrita em java usando um arquivo.txt");
		bw.write(System.lineSeparator());	
		bw.newLine();	
		bw.newLine();
		bw.write("Outra linha de teste hehehehe");			
		
		bw.close();
		
		long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

	}

}
