package br.org.generation.alunoCurso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import br.org.generation.alunoCurso.model.Curso;


@Entity
@Table(name = "tblaluno")
public class Aluno {
	
	@ManyToOne
	@JsonIgnoreProperties("curso")
	private Curso curso;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ra")
	private int ra;
	
	@Column(name = "nome", length = 20)
	private String nome;
	
	@Column(name = "sobrenome", length = 80)
	private String sobrenome;
	
	@Column(name = "email", length = 30)
	private String email;
	
	@Column(name = "tel", length = 14)
	private String telefone;
	
	
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	

}