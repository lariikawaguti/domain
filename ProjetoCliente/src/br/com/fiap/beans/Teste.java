package br.com.fiap.beans;

public class Teste {

	private String nome;
	private int idade;
	private double valorConsulta;
	
	//Setters (Entrada)
	
	public void setNome (String nome){
	this.nome = nome;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public void setValorConsulta (double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	//Getters (Exibir)
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getValorConsulta() {
	return valorConsulta;
	}
}
