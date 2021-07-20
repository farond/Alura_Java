package br.com.lino.javaoito.teste;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class RegrasMetodo implements Consumer<String>, Comparator<String>, UnaryOperator<String> {

	@Override
	public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;    
	}

	@Override
	public void accept(String s) {
        System.out.println(s);
		
	}

	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}
	

}
