/**
 * C07Casting
 * Casting é o processo de converter um tipo de dado em outro
 * 
 * Casting Implícito: ocorre automaticamente quando não há perda de dados
 * 
 * Casting Explícito: requer uma expressão entre parênteses antes do valor a ser
 * convertido, usado quando pode ocorrer perda de dados
 */
public class C07Casting {

  public static void main(String[] args) {
    // Casting implícito
    int meuInt = 10;
    double meuDouble = meuInt;

    String meuString = "Valor do String";
    Object meuObject = meuString;

    System.out.println("Valor do int: " + meuInt);
    System.out.println("Valor do double: " + meuDouble);
    System.out.println("Valor da String: " + meuString);
    System.out.println("Valor do Object: " + meuObject);

    // Casting explícito
    double meuDouble2 = 10.5;
    int meuInteiro2 = (int) meuDouble2;
    Object meuObject2 = "Valor do Object";
    String meuString2 = (String) meuObject2;

    System.out.println("Valor do double: " + meuDouble2);
    System.out.println("Valor do int: " + meuInteiro2);
    System.out.println("Valor do Object: " + meuObject2);
    System.out.println("Valor da String: " + meuString2);
  }
}