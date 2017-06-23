package br.ufrpe.advocacia.DAO;

import java.util.ArrayList;

import br.urfpe.advocacia.beans.Advogado;

public class AdvogadoDAO {
	
	ArrayList<Advogado> advogados = new ArrayList();
	
	public boolean procurarAdvogado(String nome){
		
		return true;
	}
	public boolean alterarAdvogado(String nome){
		return true;
	}
	public boolean deletarAdvogado(String nome){
		return true;
	}
	public void cadastrarProcesso(Advogado advogado){
		
		advogados.add(advogado);
	
	}
}
