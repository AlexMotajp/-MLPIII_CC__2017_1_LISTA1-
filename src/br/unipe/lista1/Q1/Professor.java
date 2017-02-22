package br.unipe.lista1.Q1;

public class Professor {
	
	private String CPF, matricula, titulo, especialidade;
	
	public Professor(String CPF, String matricula, String titulo, String especialidade){
		this.CPF           = CPF;
		this.matricula     = matricula;
		this.titulo        = titulo;
		this.especialidade = especialidade;
	}
	
	public Professor(String CPF, String matricula, String titulo){
		this(CPF,matricula,titulo,"IA");
	}
	
	public Professor(String CPF, String matricula){
		this(CPF,matricula,"Mestre","Engenharia de Software");
	}

}
