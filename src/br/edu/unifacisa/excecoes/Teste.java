package br.edu.unifacisa.excecoes;

public class Teste {
	public static void main(String[] args) {
		Conta c1 = new Conta("Herriot");
		
		System.out.print("Digite um valor para depositar: ");
		double deposito = Teclado.leDouble();
		c1.depositar(deposito);
		
		// Vou TENTAR executar o método sacar
		try {
			System.out.print("Digite um valor para sacar: ");
			double saque = Teclado.leDouble();
			
			System.out.println("Realizando o saque ...");
			// O método sacar PODE lançar exceções
			c1.sacar(saque);
			System.out.println("Saque realizado com sucesso");
		} catch (Exception e) {
			// Eita, não consegui sacar o dinheiro - deu erro
			System.out.println("Não foi possível realizar o saque");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo da conta: R$ " + c1.getSaldo());
		
		// Criando a minha conta
		Conta contaDeBruno = new Conta("Bruno");
		contaDeBruno.depositar(500);
		try {
			System.out.println("Transferindo dinheiro de Bruno para Herriot ...");
			contaDeBruno.transferir(240, c1);
			System.out.println("Transferência realizada com sucesso !");
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a transferência");
			System.out.println(e.getMessage());
		}
		System.out.println("Saldo de Herriot: R$ " + c1.getSaldo());
		System.out.println("Saldo de Bruno: R$ " + contaDeBruno.getSaldo());
	}
}
