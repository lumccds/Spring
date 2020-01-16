package com.example.testeDois.model;

public class Produtos {
	public int id;
	public String titulo;
	public String detalhes;
	public double preco;
	public double qtd;
	public String linkFoto;
	
	
	public String infoP() {
		return "{\"id\": \""		+this.id+"\"<br>"+
				"\"Titulo\": \""	+this.titulo+"\"<br>"+
				"\"Detalhes\": \""	+this.detalhes+"\"<br>"+
				"\"Preço\": R$\""	+this.preco+"\"<br>"+
				"\"Quantidade\": \""+this.qtd+"\"<br>"+
				"\"Foto:\" \""		+this.linkFoto+"\"<br>"+				
				"}";
	}

}
