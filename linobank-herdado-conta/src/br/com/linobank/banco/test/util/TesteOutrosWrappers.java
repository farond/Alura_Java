package br.com.linobank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing      
        System.out.println(idadeRef.intValue());//unboxing
        
        Double dRef = Double.valueOf(3.2); //autoboxing 
        System.out.println(dRef.doubleValue()); //unboxing
        
        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());
        
        Number refNumero = Integer.valueOf(26);
        System.out.println(refNumero);
        
        List<Number> lista = new ArrayList<>();
        lista.add(6.5);
        lista.add(26.5f);
        lista.add(58784881L);
        
        System.out.println(lista);
        
	}

}
