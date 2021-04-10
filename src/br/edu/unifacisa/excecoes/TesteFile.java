package br.edu.unifacisa.excecoes;

import java.io.File;

public class TesteFile {
	public static void main(String[] args) {
		System.out.println("Digite um caminho para uma pasta: ");
		String pasta = Teclado.leString();
		
		File f = new File(pasta);
		// se a pessoa digitar um caminho inválido, vai dar erro no bloco abaixo
		try {
			for (File arquivo : f.listFiles()) {
				System.out.println(arquivo);
			}
		} catch (Exception e) {
			System.out.println("O caminho especificado é inválido");
		}
	}
}
