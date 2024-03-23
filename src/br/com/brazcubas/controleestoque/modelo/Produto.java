package br.com.brazcubas.controleestoque.modelo;

public class Produto {

  private String nome;

  private double preco;

  private int quantidade;

  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public String getDetalhesProduto() {
    return nome + " - R$ " + preco + " - Quantidade: " + quantidade;
  }

  public void registrarVenda(int quantidade) throws Exception {
    if (this.quantidade == 0 || this.quantidade < quantidade) {
      throw new RuntimeException("Quantidade insuficiente em estoque!");
    }
    this.quantidade -= quantidade;
  }
}
