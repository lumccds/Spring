package br.org.generation.alunoCurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.alunoCurso.dao.ICursoRepo;
import br.org.generation.alunoCurso.model.Curso;

@Component
public class CursoServiceImpl implements ICursoService{
	
	@Autowired
	private ICursoRepo repo;
	
	@Override
	public void adicionarNovoCurso(Curso curso) {
		repo.save(curso);
	}

	@Override
	public Curso recuperarDetalhes (int idCurso) {
		return repo.findById(idCurso).get();
	}

	@Override
	public List<Curso> recuperarTodos() {
		// TODO Auto-generated method stub
		return (List<Curso>)repo.findAll();
	}
}
