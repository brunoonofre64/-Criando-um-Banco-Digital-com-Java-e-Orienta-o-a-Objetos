package br.com.dio;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Bruno Onofre");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		
        cc.depositar(100);		
		cc.transferir(poupanca, 50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Banco banco = new Banco();
		banco.nomesClientes(cliente);
		
	}

}
