package br.com.brazcubas.exercicio;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private ArrayList<Double> notas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void addNota(double nota) {
		this.notas.add(nota);
	}

	public double calcularMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.size();
	}
}
