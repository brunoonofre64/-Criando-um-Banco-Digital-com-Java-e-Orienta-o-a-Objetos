package br.com.dio;

public class Cliente {
	
	private String nome;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente nome: " + nome ;
	}
	
	

}
