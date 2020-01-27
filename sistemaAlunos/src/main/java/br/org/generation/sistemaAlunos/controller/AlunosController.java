package br.org.generation.sistemaAlunos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.sistemaAlunos.model.Alunos;

@RestController
@CrossOrigin("*")
public class AlunosController {
@PostMapping("/aluno/novo")
public ResponseEntity<Alunos> inserirNovoAluno(@RequestBody Alunos aluno){
return null;
}

@GetMapping("/aluno/{id}")
public ResponseEntity<Alunos> buscarAlunoPeloId(@PathVariable int id){
return null;
}

@PutMapping ("/aluno/{id}")
public ResponseEntity<Alunos> atualizarDados (@RequestBody Alunos aluno){
return null;
}
}