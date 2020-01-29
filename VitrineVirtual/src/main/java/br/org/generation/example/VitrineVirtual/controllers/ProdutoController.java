package br.org.generation.example.VitrineVirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.example.VitrineVirtual.model.Produto;
import br.org.generation.example.VitrineVirtual.servicos.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private IProdutoService servico; 				//declarando a interface
	
	@GetMapping("/produto/")
	public ResponseEntity<List<Produto>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
		
	}
	
	@GetMapping("/produto/{id}")					//PathVariable: Variavel que faz parte da URL -> "caminho variavel pela variavel"
	public ResponseEntity<Produto> mostrarPeloId(@PathVariable int id){
		Produto p = servico.recuperarPorId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}

}
