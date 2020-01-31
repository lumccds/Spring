package br.org.generation.alunoCurso.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.alunoCurso.model.Curso;

public interface ICursoRepo extends CrudRepository <Curso, Integer>{

}
