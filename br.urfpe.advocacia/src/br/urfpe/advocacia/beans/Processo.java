package br.urfpe.advocacia.beans;

import java.util.ArrayList;

public class Processo {
	
	private  static  long NextID =  1;
	
	private Pessoa cliente;
	private String descrição;
	private ArrayList<Audiencia> audiencia;
	private long id;
	
	public Processo(Pessoa cliente, String descrição) 
	{
		this.cliente = cliente;
		this.descrição = descrição;
		this.audiencia = new ArrayList<Audiencia>();
		this.id = NextID++;
	}
	
	public Processo()
	{
		this(null, null);
	}
	
	
	
	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Pessoa getCliente() {
		return cliente;
	}
	
	public long getId() {
		return id;
	}

	@Override
	public String toString()
	{
		String resultado = "";
		resultado += "Cliente: " + this.getCliente();
		resultado += "\n Descrição: " + this.getDescrição();
		return resultado;
	}
	
}
