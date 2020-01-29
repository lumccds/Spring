package br.org.generation.example.VitrineVirtual.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.example.VitrineVirtual.dao.ProdutoRepo;
import br.org.generation.example.VitrineVirtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService{
	
	@Autowired					//busca uma implementação dentro do JSON
	private ProdutoRepo repo;
	
	@Override 					//corresponde a um "select * from tblproduto"
	public List<Produto> recuperarTodos(){
		return (List<Produto>)repo.findAll();
	}
	
	@Override
	public Produto recuperarPorId(int id){
		return repo.findById(id).get();
	}

}
