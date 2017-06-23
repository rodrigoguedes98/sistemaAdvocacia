package br.urfpe.advocacia.beans;

import java.time.LocalDate;



public class Advogado extends Pessoa {
	private Pessoa pessoa;
	private Login login;

	public Advogado(String nome, String cpf, LocalDate dataNascimento, Login login) {
		super(nome, cpf, dataNascimento);
		this.login = login;
	}
	public Advogado(){
		
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	public Pessoa getPessoa(){
		return pessoa;
	}
	
	public String toString(){
		return "advogado" + getNome() + getCpf() + getDataNascimento() + "Login" + getLogin();
	}

}
