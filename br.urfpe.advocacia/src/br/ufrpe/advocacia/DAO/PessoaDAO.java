package br.ufrpe.advocacia.DAO;

import java.util.ArrayList;

import br.urfpe.advocacia.beans.Pessoa;

public class PessoaDAO {

	ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	public boolean procurarProcesso(String cpf){
		
		boolean resultado = true;
		
		for (int i = 0; i < pessoas.size(); i++) {
			if(cpf.equals(pessoas.get(i).getCpf())){
				resultado = true;
			}else{
				resultado = false;
			}
		}
		return resultado;
	}
	public boolean alterarProcesso(String cpf){
boolean resultado = true;
		
		for (int i = 0; i < pessoas.size(); i++) {
			if(cpf.equals(pessoas.get(i).getCpf())){
				resultado = true;
			}else{
				resultado = false;
			}
		}
		return resultado;
	}
	public boolean deletarPessoa(String cpf){
boolean resultado = true;
		
		for (int i = 0; i < pessoas.size(); i++) {
			if(cpf.equals(pessoas.get(i).getCpf())){
				resultado = true;
			}else{
				resultado = false;
			}
		}
		return resultado;
	}
	public void cadastrarPessoa(Pessoa pessoa){
		pessoas.add(pessoa);
	}
}
