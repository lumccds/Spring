package br.org.generation.example.VitrineVirtual.dao;

import org.springframework.data.repository.CrudRepository;
import br.org.generation.example.VitrineVirtual.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{
	

}
