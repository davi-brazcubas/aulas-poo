/**
 * C05SintaxeSemantica
 * Sintaxe refere-se à estrutura gramatical do código, incluindo palavras
 * reservadas, operadores e expressões
 * 
 * Semântica refere-se ao significado do código, ou seja, o que o código
 * realmente faz
 */
public class C05SintaxeSemantica {

  public static void main(String[] args) {
    // Erro de sintaxe, declaração sem ponto e virgula no fim
    // Remova o comentário da linha abaixo para ver a IDE acusando erro
    // int meuNumero = 10

    // Erro de semântica, condição de parada não incrementada, gerando loop infinito
    int i = 0;
    while (i < 10) {
      System.out.println("Hello World");
    }
  }
}
