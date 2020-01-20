package br.org.generation.webmotors.bd;

import java.util.ArrayList;

import br.org.generation.webmotors.model.Cliente;

public class BDCliente {

	private ArrayList<Cliente> lista;
	
	public BDCliente() {
		lista = new ArrayList<Cliente>();
	}
	
	public void gravar(Cliente c) {
		this.lista.add(c);
	}
	
	//CORRESPONDE AO READ
	public Cliente buscar(int ID) {
		Cliente c = null;
		for (Cliente cli: lista) {
			if (cli.getID() == ID) {
				c = cli;
				break;
			}
		}			
		return c;
	}
	
	//CORRESPONDE AO DELETE
	public boolean apagar(int id) {
		int posicao = -1;
		for (int i = 0; i< lista.size(); i++) {
			if (lista.get(i).getID() == id) {
				posicao = i;
				break;
			}
		}
		if (posicao >=0) {
			lista.remove(posicao);
			return true;
		}
		else {
			return false;
		}
	}
	
	//CORRESPONDE AO UPDATE
	public void atualizar(Cliente c) {
		int posicao = -1;
		for (int i=0; i< lista.size(); i++) {
			if (lista.get(i).getID() == c.getID()) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0) {
			lista.set(posicao, c);
		}
	}
	
	public ArrayList<Cliente>buscarTodos() {
		return lista;	
	}
	
}
