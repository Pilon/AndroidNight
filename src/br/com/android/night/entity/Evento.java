package br.com.android.night.entity;

public class Evento {

	private final String descricao;
	private final String nome;
	
	public Evento(String nome, String descricao){
		this.nome = nome;
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + " - " + this.descricao;
	}
	
}
