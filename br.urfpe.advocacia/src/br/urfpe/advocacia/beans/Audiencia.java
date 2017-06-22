package br.urfpe.advocacia.beans;

import java.time.LocalDate;

public class Audiencia {
	
	private static long NextIDA = 1;
	private Pessoa cliente;
	private Advogado advogado;
	private LocalDate data;
	private Pessoa juiz;
	private long id;
	
	public Audiencia(Pessoa cliente, Advogado advogado, LocalDate data, Pessoa juiz) {
		this.cliente = cliente;
		this.advogado = advogado;
		this.data = data;
		this.juiz = juiz;
		this.id = NextIDA++;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public long getId() {
		return id;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Pessoa getJuiz() {
		return juiz;
	}

	public void setJuiz(Pessoa juiz) {
		this.juiz = juiz;
	}
	
	@Override
	public String toString()
	{
		String resultado = "";
		resultado += "Cliente: " + this.getCliente();
		resultado += "\nAdvogado: " + this.getAdvogado();
		resultado += "\nData da audiência: " + this.getData();
		resultado += "\nJuiz: " + this.getJuiz();
		
		return resultado;
	}
	
}
