package br.org.generation.alunoCurso.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.alunoCurso.model.Aluno;


public interface IAlunoRepo extends CrudRepository<Aluno, Integer>{
	

}
