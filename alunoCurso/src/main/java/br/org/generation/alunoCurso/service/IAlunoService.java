package br.org.generation.alunoCurso.service;

import java.util.List;

import br.org.generation.alunoCurso.model.Aluno;

public interface IAlunoService {
	public List<Aluno> recuperarTodos();
	public Aluno recuperarPorRa(int ra);

}
