package br.com.lino.javaoito.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate meuAniversario = LocalDate.of(2022, Month.JUNE, 28);
		
		int anos = meuAniversario.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, meuAniversario);
		System.out.println(periodo);
		
		LocalDate proximoAniversario = meuAniversario.plusYears(1);
		System.out.println(proximoAniversario);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximoAniversario.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorHoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
        String day = LocalDate.of(2022, 06, 28).getDayOfWeek().name();
        System.out.println(day);
        
        String dayInFuture = LocalDate.of(2099, 01, 25).getDayOfWeek().name();
        System.out.println(dayInFuture);
        
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
        
        Period periodoFuturo = Period.between(hoje, dataFutura);
        System.out.println(periodoFuturo);
		
		
	}

}
