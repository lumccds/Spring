package br.org.generation.alunoCurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.alunoCurso.model.Aluno;
import br.org.generation.alunoCurso.service.IAlunoService;


@RestController
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private IAlunoService servico; 				
	
	@GetMapping("/aluno/")
	public ResponseEntity<List<Aluno>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
		
	}
	
	@GetMapping("/aluno/{ra}")
	public ResponseEntity<Aluno> mostrarPeloRa(@PathVariable int ra){
		Aluno a = servico.recuperarPorRa(ra);
		if (a != null) {
			return ResponseEntity.ok(a);
		}
		return ResponseEntity.notFound().build();
	}

}
