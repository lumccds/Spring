package br.org.generation.webmotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.bd.BDCliente;
import br.org.generation.webmotors.model.Cliente;

@RestController
public class ClienteController {
	
	//criei meu banco de dados
	private BDCliente bd = new BDCliente();
	
	@PostMapping("/cliente/novo")
	public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente cliente) {
		bd.gravar(cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable int id){
		Cliente cli = bd.buscar(id);
		if (cli != null) {
			return ResponseEntity.ok(cli); 
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	@PutMapping("/cliente/{id}")
	public ResponseEntity<String> removeCliente(@PathVariable int id){
		if (bd.apagar(id)) {
			return ResponseEntity.ok("USER DELETED");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
//	@GetMapping("/cliente/teste")
//	public Cliente testeCliente() {
//		Cliente c = new Cliente();
//		c.setID(4321);
//		c.setNome("Luma");
//		c.setEmail("luma@email.com");
//		c.setCpf("111.222.333-56");
//		c.setTelefone("99999-1111");
//		c.setDetalhes("Detalhou toda");
//		
//		return c;
//	}
	
}
