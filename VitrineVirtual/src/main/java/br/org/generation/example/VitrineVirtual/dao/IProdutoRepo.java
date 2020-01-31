package br.org.generation.example.VitrineVirtual.dao;

import org.springframework.data.repository.CrudRepository;
import br.org.generation.example.VitrineVirtual.model.Produto;

public interface IProdutoRepo extends CrudRepository<Produto, Integer>{
	

}
