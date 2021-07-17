package br.com.linobank.banco.test;

import br.com.linobank.banco.model.Cliente;
import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;
import br.com.linobank.banco.model.ContaPoupanca;

public class TesteObject { 

    public static void main(String[] args) { 

//        System.out.println("x");
//        System.out.println(3);
//        System.out.println(false);
        
        ContaCorrente cc = new ContaCorrente(122, 56);
        cc.deposita(150);
       
        ContaPoupanca cp = new ContaPoupanca(55, 150);
        cp.deposita(1500.0);
        
        Cliente cliente = new Cliente();
        
        System.out.println(cc);
        System.out.println(cp);

        //println(cliente);
    }

    static void println() {
    }

    static void println(int a) {
    }

    static void println(boolean valor) {
    }
    
    static void println(Conta conta) {
    	
    }
    
    static void println(Object referencia) {
    	
    }

}    
