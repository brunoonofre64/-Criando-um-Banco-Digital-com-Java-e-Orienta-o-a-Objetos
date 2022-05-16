package br.com.dio;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;

	protected int conta;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getConta() {
		return conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Agencia: %d", this.conta));
		System.out.println(String.format("Agencia: %.2f", this.saldo));
		
	}

}
