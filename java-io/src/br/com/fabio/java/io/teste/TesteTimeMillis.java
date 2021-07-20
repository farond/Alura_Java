package br.com.fabio.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteTimeMillis {

    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis();

        BufferedWriter bw = new BufferedWriter(new FileWriter("Arquivo_novo.txt"));

        bw.write("Fabio Lino");
        bw.newLine();
        bw.write("Testes de Time Millis");

        long fim = System.currentTimeMillis();

        bw.write("Passaram " + (fim - ini) + " milissegundos"); //Agora vai compilar!
        bw.close();

        System.out.println("Se passou " + (fim - ini) + " milissegundos");

    }
}