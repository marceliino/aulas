package br.com.fiap;

public class Cliente {
	
	private String numeroRG;
	private String numeroCPF;
	private String endereco;
	private String nome;
	
	public Cliente() {
	}
	
	public Cliente(String numeroRG) {
		this.numeroRG = numeroRG;
		new Cliente();
	}
	
	public Cliente(String numeroRG, String numeroCPF, String endereco, String nome) {
		this.numeroRG = numeroRG;
		this.numeroCPF = numeroCPF;
		this.endereco = endereco;
		this.nome = nome;
		new Cliente(numeroRG);
	}
}
