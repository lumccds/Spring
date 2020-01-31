package br.org.generation.alunoCurso.service;

import java.util.List;

import br.org.generation.alunoCurso.model.Curso;

public interface ICursoService {
	
	public void adicionarNovoCurso(Curso curso);
	public Curso recuperarDetalhes (int ra);
	public List<Curso> recuperarTodos();
}
