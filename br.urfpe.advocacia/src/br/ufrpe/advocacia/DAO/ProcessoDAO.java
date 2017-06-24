package br.ufrpe.advocacia.DAO;

import java.util.ArrayList;

import br.urfpe.advocacia.beans.Processo;

public class ProcessoDAO {
	
	ArrayList<Processo> processos = new ArrayList<>();
	
	public boolean procurarProcesso(long numero){
		
		boolean resultado = true;
		
		for (int i = 0; i < processos.size(); i++) {
			if(numero == processos.get(i).getId()){
				resultado = true;
			}else{
				resultado = false;
			}
		}
		return resultado;
	}
	
	public boolean alterarProcesso(long numero){
		
		boolean resultado = true;
		
		for (int i = 0; i < processos.size(); i++) {
			if(numero == processos.get(i).getId()){
				resultado = true;
			}else{
				resultado = false;
			}
		}
		return resultado;
	}
	
	public boolean deletarProcesso(long numero){
		
		boolean resultado = true;
		
		for (int i = 0; i < processos.size(); i++) {
			if(numero == processos.get(i).getId()){
				resultado = true;
			}else{
				resultado = false;
			}
		}
		return resultado;
	}
	
	public void cadastrarProcesso(Processo processo){
		processos.add(processo);
	}
}
