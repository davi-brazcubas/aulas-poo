import java.util.Arrays;

/**
 * C01Vetores
 * Um array unidimensional, também conhecido como vetor, é uma estrutura de
 * dados que armazena elementos do mesmo tipo em uma sequência unidimensional
 */
public class C01Vetores {

  public static void main(String[] args) {
    System.out.println("Vetor de inteiros:\n");
    // Criando um array de inteiros com 5 elementos
    int[] numeros = new int[5];

    // Inicializando o array com valores
    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;
    numeros[4] = 50;

    // Acessando e exibindo os elementos do array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Elemento " + i + ": " + numeros[i]);
    }

    System.out.println("\n\nVetor de String:\n");
    // Criando um array de strings com nomes
    String[] nomes = { "Ana", "João", "Maria", "Pedro" };

    // Buscando o nome "Maria" no array
    boolean encontrado = false;
    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i].equals("Maria")) {
        encontrado = true;
        break;
      }
    }

    System.out.println(Arrays.toString(nomes));

    if (encontrado) {
      System.out.println("Nome encontrado!");
    } else {
      System.out.println("Nome não encontrado!");
    }
  }

}
