package br.com.brazcubas.exercicio;

public class Carro {
	private String modelo;
	private int ano;
	private String cor;

	public Carro(String modelo, int ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	public void exibirFichaTecnica() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
	}

	public int calcularIdade() {
		return 2024 - ano;
	}
}
