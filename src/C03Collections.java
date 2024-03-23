import java.util.ArrayList;
import java.util.Arrays;

/**
 * C03Collections
 * Collections são estruturas de dados dinâmicas que podem armazenar objetos
 */
public class C03Collections {

  public static void main(String[] args) {
    System.out.println("Ordenação dos elementos de um array:\n");
    int[] numerosArray = { 5, 2, 8, 1, 9 };
    Arrays.sort(numerosArray);
    System.out.println(Arrays.toString(numerosArray));

    System.out.println("\n\nOrdenação dos elementos de uma Collection(ArrayList):\n");
    ArrayList<Integer> numerosArrayList = new ArrayList<>();
    numerosArrayList.add(5);
    numerosArrayList.add(2);
    numerosArrayList.add(8);
    numerosArrayList.add(1);
    numerosArrayList.add(9);
    numerosArrayList.sort(Integer::compareTo);

    System.out.println(numerosArrayList);
  }
}
