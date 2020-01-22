package br.org.generation.login.example.integracaoBackFront.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.login.example.integracaoBackFront.model.Produto;
import br.org.generation.login.example.integracaoBackFront.seguranca.Autenticador;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	
	@GetMapping("/produto/todos")
	public ResponseEntity<ArrayList<Produto>> getAllProdutos(@RequestParam String token){
		if (Autenticador.isValid(token)) {
			//este trecho eh o simulado de uma consula ao BD
			ArrayList<Produto> lista = new ArrayList<Produto>();
			for (int i = 0; i < 20; i++) {
				Produto p = new Produto();
				p.setCodigo(24+i);
				p.setTitulo("Haroldice "+i);
				p.setDetalhes("Maracatundas "+i);
				p.setPreco(1069.13f);
				
				lista.add(p);
			}
			return ResponseEntity.ok(lista);
		}
		return ResponseEntity.status(403).build();
	}

}
