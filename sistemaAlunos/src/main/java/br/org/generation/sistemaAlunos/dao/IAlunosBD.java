package br.org.generation.sistemaAlunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaAlunos.model.Alunos;

public interface IAlunosBD extends CrudRepository<Alunos, Integer>{

}
