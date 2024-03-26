package br.com.brazcubas.exercicio;

public class Musica {
	private String titulo;
	private String artista;
	private int anoLancamento;
	private double somaAvaliacoes;
	private int numAvaliacoes;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public void exibirFichaTecnica() {
		System.out.println("Título: " + titulo);
		System.out.println("Artista: " + artista);
		System.out.println("Ano de Lançamento: " + anoLancamento);
	}

	public void avaliar(double avaliacao) {
		this.somaAvaliacoes += avaliacao;
		numAvaliacoes++;
	}

	public double calcularMediaAvaliacoes() {
		return somaAvaliacoes / numAvaliacoes;
	}

}
