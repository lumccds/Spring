package br.org.generation.webmotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.bd.BDVeiculo;
import br.org.generation.webmotors.model.Veiculo;

@RestController
public class VeiculoController {
	
	private BDVeiculo bd = new BDVeiculo();
	
	@PostMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo veiculo) {
		bd.gravar(veiculo);
		return ResponseEntity.ok(veiculo);
	}
	
	@GetMapping("veiculo/{id}")
	public ResponseEntity<Veiculo> getVeiculo(@PathVariable int id){
		Veiculo vei = bd.buscar(id);
		if (vei != null) {
			return ResponseEntity.ok(vei);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}	
		
	@GetMapping("/veiculo/todos")
		public ResponseEntity<ArrayList<Veiculo>> getTodos(){
			return ResponseEntity.ok(bd.buscarTodos());
	}
	
	@PutMapping("/veiculo/{id}")
	public ResponseEntity<String> removeVeiculo(@PathVariable int id){
		if (bd.apagar(id)) {
			return ResponseEntity.ok("VEHICLE DELETED");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
//	@GetMapping("/veiculo/teste")
//	public Veiculo testeVeiculo() {
//		Veiculo v = new Veiculo();
//		v.setID(1234);
//		v.setMarca("Volks");
//		v.setModelo("Fusca");
//		v.setAno(1978);
//		v.setCor("Azul Turquesa");
//		v.setPreco(116900);
//		v.setTipo("Casual");
//		v.setDetalhes("Veiculo impecável");
//		
//		return v;
//	}

}
