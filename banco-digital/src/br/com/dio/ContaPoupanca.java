package br.com.dio;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" === Conta Poupan?a === ");
		super.imprimirInfosComuns();
	}
}
