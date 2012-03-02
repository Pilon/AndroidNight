package br.com.android.night.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.android.night.entity.Evento;

public class ListaDAO {
	private static ListaDAO instance = new ListaDAO();
	
	
	private final List<Evento> listaEventos;

	public static ListaDAO getInstance(){
	return instance;
	}
	private ListaDAO(){
		this.listaEventos = new ArrayList<Evento>();
	}
	public List<Evento> getListaEventos() {
		return listaEventos;
	}
	
	public void add(Evento evento ){
		listaEventos.add(evento);
	}
	
}
