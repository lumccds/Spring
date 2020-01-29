package br.org.generation.example.VitrineVirtual.servicos;

import java.util.List;

import br.org.generation.example.VitrineVirtual.model.Produto;

public interface IProdutoService {
	public List<Produto> recuperarTodos();
	public Produto recuperarPorId(int id);

}
