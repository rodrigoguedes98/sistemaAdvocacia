package br.ufrpe.advocacia.DAO;

import java.util.ArrayList;

import br.urfpe.advocacia.beans.Audiencia;

public class AudienciaDAO {

	ArrayList<Audiencia> audiencias = new ArrayList<>();
	
	public boolean procurarAudiencia(long id){
		
		boolean resultado = true;
		
		for(int i=0; i<audiencias.size();i++){
			if(id == audiencias.get(i).getId()){
			resultado =  true;
			}else{
			resultado =  false;	
			}
		}
		return resultado;
		
	}
	public boolean alterarAudiencia(long id){
boolean resultado = true;
		
		for(int i=0; i<audiencias.size();i++){
			if(id == audiencias.get(i).getId()){
			resultado =  true;
			}else{
			resultado =  false;	
			}
		}
		return resultado;
		
	}
	public boolean deletarAudiencia(long id){
boolean resultado = true;
		
		for(int i=0; i<audiencias.size();i++){
			if(id == audiencias.get(i).getId()){
			resultado =  true;
			}else{
			resultado =  false;	
			}
		}
		return resultado;
		
	}
	public void cadastrarAudiencia(Audiencia audiencia){
		audiencias.add(audiencia);
	}
}
