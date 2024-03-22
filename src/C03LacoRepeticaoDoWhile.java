import java.util.Scanner;

/**
 * C03LacoRepeticaoDoWhile
 * Laços de repetição são usados para executar um bloco de código várias vezes
 */
public class C03LacoRepeticaoDoWhile {

  public static void main(String[] args) {
    // geralmente utilizado quando o número de iterações não é conhecido a priori
    Scanner scanner = new Scanner(System.in);

    int numeroPar;
    do {
      numeroPar = scanner.nextInt();
    } while (numeroPar % 2 != 0);

    scanner.close();
  }
}
