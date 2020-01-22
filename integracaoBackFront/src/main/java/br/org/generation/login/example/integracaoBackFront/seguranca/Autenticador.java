package br.org.generation.login.example.integracaoBackFront.seguranca;

import javax.xml.bind.DatatypeConverter;

import br.org.generation.login.example.integracaoBackFront.model.Usuario;


public class Autenticador {
	private static final String PREFIXO="GeNeRaTiOn|";
	
	public static String generateToken(Usuario usuario) {
		String str = PREFIXO + usuario.toString();
		String token = DatatypeConverter.printHexBinary(str.getBytes());
		return token;
	}
	
	public static boolean isValid(String token) {
		byte[] vetor = DatatypeConverter.parseHexBinary(token);
		String novaString = new String(vetor);
		//System.out.println("DEBUG = +novaString");
		if (novaString.startsWith(PREFIXO)) {
			return true;
		}
		return false;
	}
}
