package br.com.dio;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();
	private List<Cliente> nomeCliente = new ArrayList<>();

	public Banco() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
   
	public List<Cliente> nomesClientes(Cliente nomes){
		this.nomeCliente.add(nomes);
		  
		for(Cliente listaNomes: nomeCliente) {
			System.out.println(listaNomes.getNome());
		}
		return nomeCliente;
	}
	
	
	@Override
	public String toString() {
		return "Cliente nome: " + nome ;
	}
	
}
