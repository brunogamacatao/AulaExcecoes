package br.edu.unifacisa.excecoes;

/**
 * Essa classe representa uma conta bancária.
 * Uma conta tem um titular e um saldo.
 * Essa conta não permite saldo negativo. 
 */
public class Conta {
	// Atributos
	private String titular;
	private double saldo;
	
	/**
	 * Construtor da classe conta.
	 * O parâmetro titular é obrigatório.
	 * A conta será criada com saldo zero
	 */
	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	
	// Métodos utilitários da classe conta
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Esse método realiza uma operação de saque na conta. 
	 * 
	 * @param valor Valor para sacar da conta.
	 * @throws Exception Essa exceção acontece se o usuário tentar sacar mais do quê o saldo da conta.
	 */
	public void sacar(double valor) throws Exception {
		if (valor > this.saldo) { // se o valor que estou tentando sacar, for maior que o saldo da conta ...
			// significa que eu não tenho esse dinheiro
			// vou lançar uma exceção
			throw new Exception("Saldo insuficiente !");
		} else {
			// caso contrário, pode fazer o saque
			this.saldo -= valor;
		}
	}
	
	public void transferir(double valor, Conta outraConta) throws Exception {
		this.sacar(valor);
		outraConta.depositar(valor);
	}

	// Métodos get e set
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
