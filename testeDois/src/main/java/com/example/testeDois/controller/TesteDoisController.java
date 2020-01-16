package com.example.testeDois.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.testeDois.model.Produtos;
import com.example.testeDois.model.Usuarios;

@RestController

public class TesteDoisController {
	@GetMapping("/home")
		public String boasVindas() {
			return "Seja bem-vindx!";
		}
	@GetMapping("/user")
		public String users() {
		Usuarios u = new Usuarios();
		u.id = 1;
		u.login = "login 1";
		u.email = "email@um.com";
		u.nomeCompleto = "NomeCompleto 1";
		u.senha = "senha1";
		u.perfilAcesso = 1;

		return u.infoU();
		}
	@GetMapping("/produtos")
	public String prods() {
		Produtos p = new Produtos();
		p.id = 1;
		p.titulo = "Produto 1";
		p.detalhes = "Detalhe 1";
		p.preco = 1.0;
		p.qtd = 1.0;
		p.linkFoto = "Link 1";

		return p.infoP();
	}
	

}
