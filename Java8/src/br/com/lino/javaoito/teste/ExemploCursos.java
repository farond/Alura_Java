package br.com.lino.javaoito.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.lino.javaoito.model.Curso;

public class ExemploCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparing(Curso::getAlunos));

		// cursos.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("Cursos com mais de 50 alunos: ");
		//Lambda
		cursos.stream().filter(c -> c.getAlunos() > 50)
		   .forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("Cursos com mais de 50 alunos de forma decrescent ");
		//forma Decrescente
		cursos.stream().filter(curso -> curso.getAlunos() > 50)
        .map(curso -> curso.getNome())
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
		
		cursos.stream().filter(c -> c.getAlunos() >= 50)
		.map(c -> c.getAlunos())
		.forEach(total -> System.out.println(total));
		
		//Usando com metodo references
		cursos.stream().filter(c -> c.getAlunos() >= 100)
		.map(Curso::getAlunos)
		.forEach(System.out::println);
		
		//Somando os cursos que tem mais de 100 alunos
		int soma = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .mapToInt(Curso::getAlunos)
				   .sum();
		System.out.println(soma);
		
		OptionalDouble media = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .mapToInt(Curso::getAlunos)
				   .average();
		System.out.println(media);
		
		
		
		System.out.println("Nome de todos os cursos*** ");
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		nomes.forEach(System.out::println);
		
		System.out.println("Nome de todos os cursos*** ");
		cursos.stream().filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
		//.forEach(c -> System.out.println(c.getNome()));//imprimindo o nome dos cursos que tem mais de 100 alunos
	
//		Optional<Curso> optional = cursos.stream()
//				   .filter(c -> c.getAlunos() > 100)
//				   .findAny();
//		Curso curso = optional.orElse(null);
//		System.out.println(curso.getNome());
//		optional.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .findAny()
		   .ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .findFirst()
		   .ifPresent(c -> System.out.println(c.getNome()));;
		   
		OptionalDouble mediaCursos = cursos.stream()				   
				   .mapToInt(Curso::getAlunos)
				   .average();
		System.out.println(mediaCursos);
		
        List<Curso> filtroCurso = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());
               
                
        
	}
	
	

}
