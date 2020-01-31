package br.org.generation.alunoCurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.alunoCurso.dao.IAlunoRepo;
import br.org.generation.alunoCurso.model.Aluno;

@Component
public class AlunoServiceImpl implements IAlunoService{
	
	@Autowired
	private IAlunoRepo repo;

	@Override
	public List<Aluno> recuperarTodos() {
		// TODO Auto-generated method stub
		return (List<Aluno>)repo.findAll();
	}

	@Override
	public Aluno recuperarPorRa(int ra) {
		// TODO Auto-generated method stub
		return repo.findById(ra).orElse(null);
	}
	
	
}
