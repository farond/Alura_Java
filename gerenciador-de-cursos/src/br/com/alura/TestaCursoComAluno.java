package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        Aluno a1 = new Aluno("Fabio Lino", 34668);
        Aluno a2 = new Aluno("Sarah Lino", 56874);
        Aluno a3 = new Aluno("Danilva Lino", 17584);
        
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
        	System.out.println(a);
        });
        
        System.out.println("O aluno " + a1 + " est? matriculado?");
        System.out.println(javaColecoes.estaMariculado(a1));

	}

}
