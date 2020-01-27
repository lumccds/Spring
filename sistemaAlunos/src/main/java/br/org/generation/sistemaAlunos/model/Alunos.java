package br.org.generation.sistemaAlunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_aluno")
public class Alunos {
	
	@Column(name = "ra")		//indica que eh uma coluna
	@Id							//indica que eh product key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica que eh auto_increment
	private int ra;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="email", length = 20)
	private String email;
	
	@Column(name="tel", length = 20)
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