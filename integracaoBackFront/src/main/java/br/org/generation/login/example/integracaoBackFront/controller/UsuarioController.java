package br.org.generation.login.example.integracaoBackFront.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.login.example.integracaoBackFront.model.Usuario;
import br.org.generation.login.example.integracaoBackFront.seguranca.Autenticador;
import br.org.generation.login.example.integracaoBackFront.seguranca.Token;

@RestController
@CrossOrigin("*")
public class UsuarioController {
	

	@PostMapping("/login")
	public ResponseEntity<Token> autentica(@RequestBody Usuario usuario){
		if (usuario.getEmail().contentEquals("user@user.com") && usuario.getSenha().equals("1234")) {
			//simulando que recuperei o usuário do BD
			usuario.setId(1);
			usuario.setNome("Luma Canuto");
			
			//construir o Token
			String tk = Autenticador.generateToken(usuario);
			System.out.println("TOKEN gerado = "+tk);
			Token token = new Token();
			token.setStrToken(tk);
			return ResponseEntity.ok(token);
		}
		else {
			return ResponseEntity.status(403).build();
		}
	}
	
}
