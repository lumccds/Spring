package com.example.testeDois.model;

public class Usuarios {
	public int id;
	public String login;
	public String email;
	public String nomeCompleto;
	public String senha;
	public int perfilAcesso;
	
	public String infoU() {
		return "{\"id\": \""				+this.id+"\"<br>"+
				"\"login\": \""				+this.login+"\"<br>"+
				"\"E-mail\": \""			+this.email+"\"<br>"+
				"\"Nome Completo\": R$\""	+this.nomeCompleto+"\"<br>"+
				"\"Senha\": \""				+this.senha+"\"<br>"+
				"\"Perfil de Acesso:\" \""	+this.perfilAcesso+"\"<br>"+				
				"}"; 
	}
}
