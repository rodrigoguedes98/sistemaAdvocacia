package br.urfpe.advocacia.beans;

import java.util.ArrayList;

public class Processo {
	
	private  static  long NextID =  1;
	
	private Pessoa cliente;
	private String descri��o;
	private ArrayList<Audiencia> audiencia;
	private long id;
	
	public Processo(Pessoa cliente, String descri��o) 
	{
		this.cliente = cliente;
		this.descri��o = descri��o;
		this.audiencia = new ArrayList<Audiencia>();
		this.id = NextID++;
	}
	
	public Processo()
	{
		this(null, null);
	}
	
	
	
	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
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
		resultado += "\n Descri��o: " + this.getDescri��o();
		return resultado;
	}
	
}
