package br.com.fabio.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscrita3 {
	
public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com um Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw  = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
	
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Ol� pessoal, testando a escrita em java usando um arquivo.txt");
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.println("Outra linha de teste hehehehe");			
		
		ps.close();
		
		System.out.println();
		

	}

}
