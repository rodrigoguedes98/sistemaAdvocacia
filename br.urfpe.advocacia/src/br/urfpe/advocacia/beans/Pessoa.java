package br.urfpe.advocacia.beans;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	
	private  static  long NextID =  1 ;
	private long id;
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private long idade;
	
	
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = Period.between(this.dataNascimento, LocalDate.now()).getYears();
		this.id = NextID++;
	}
	
	
	public Pessoa()
	{
		//esses null tao bugando o teste
		//this(null, null, null);
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public long getId() {
		return id;
	}


	public long getIdade() {
		return idade;
	}
	
	@Override
	public String toString()
	{
		String resultado ="";
		resultado += "Nome: " + this.getNome();
		resultado += "\nIdade " + this.getIdade() + " anos";
		resultado +="\nCPF: " + this.getCpf();
		
		return resultado;
	}
}
