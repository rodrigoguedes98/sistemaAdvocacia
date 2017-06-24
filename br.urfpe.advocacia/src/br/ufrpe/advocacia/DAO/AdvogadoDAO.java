package br.ufrpe.advocacia.DAO;

import java.util.ArrayList;

import br.urfpe.advocacia.beans.Advogado;

public class AdvogadoDAO {
	ArrayList<Advogado> advogados = new ArrayList<>();
	
	public boolean procurarAdvogado(String cpf){
		
		boolean resultado = true;
		for(int i=0; i<advogados.size();i++){
			if(cpf.equals(advogados.get(i).getCpf())){
			resultado =  true;
			}else{
			resultado =  false;	
			}
		}
		return resultado;
	}
	
	public boolean alterarAdvogado(String cpf){
		
		boolean resultado = true;
		for(int i=0; i<advogados.size();i++){
			if(cpf.equals(advogados.get(i).getCpf())){
			resultado =  true;
			}else{
			resultado =  false;	
			}
		}
		return resultado;
		}
		
	public boolean deletarAdvogado(String cpf){
		
		boolean resultado = true;
		for(int i=0; i<advogados.size();i++){
			if(cpf.equals(advogados.get(i).getCpf())){
			resultado =  true;
			}else{
			resultado =  false;	
			}
		}
		return resultado;
		
	}
	public void cadastrarAdvogado(Advogado advogado){
		
		advogados.add(advogado);
	
	}
}
