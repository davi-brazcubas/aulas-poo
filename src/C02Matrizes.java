/**
 * C02Matrizes
 * Um array bidimensional, ou matriz, é uma estrutura de dados que armazena
 * elementos em linhas e colunas
 * 
 * Um array multidimensional é uma extensão do conceito de matriz, onde podem
 * ser definidas mais de duas dimensões
 */
public class C02Matrizes {

  public static void main(String[] args) {
    System.out.println("Matriz de inteiros:\n");
    // Criando uma matriz 2x3 de inteiros
    int[][] matriz = new int[2][3];

    // Inicializando a matriz com valores
    matriz[0][0] = 1;
    matriz[0][1] = 2;
    matriz[0][2] = 3;
    matriz[1][0] = 4;
    matriz[1][1] = 5;
    matriz[1][2] = 6;

    // Exibindo os elementos da matriz
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.println("Elemento [" + i + "][" + j + "]: " + matriz[i][j]);
      }
    }

    System.out.println("\n\nSoma da Matriz de inteiros:\n");
    // Calculando a soma dos elementos em uma matriz
    int[][] matrizSoma = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int soma = 0;
    for (int i = 0; i < matrizSoma.length; i++) {
      for (int j = 0; j < matrizSoma[i].length; j++) {
        soma += matrizSoma[i][j];
      }
    }
    System.out.println("Soma dos elementos da matriz: " + soma);
  }
}
