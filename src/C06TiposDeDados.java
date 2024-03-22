/**
 * C06TiposDeDados
 * Tipos primitivos e não primitivos
 */
public class C06TiposDeDados {
  
  public static void main(String[] args) {
    // Tipos primitivos
    boolean meuBoolean = false;
    byte meuByte = 0;
    char meuChar = '0';
    short meuShort = 0;
    int meuInt = 0;
    long meuLong = 0;
    float meuFloat = 0;
    double meuDouble = 0;

    System.out.println("Valo do boolean: " + meuBoolean);
    System.out.println("Valor do byte: " + meuByte);
    System.out.println("Valor do char: " + meuChar);
    System.out.println("Valor do short: " + meuShort);
    System.out.println("Valor do int: " + meuInt);
    System.out.println("Valor do long: " + meuLong);
    System.out.println("Valor do float: " + meuFloat);
    System.out.println("Valor do double: " + meuDouble);

    // Tipos não primitivos (classes)
    String minhaString = "Texto da String";
    Object meuObject = new Object();

    System.out.println("Valor da String: " + minhaString);
    System.out.println("Valor do Object: " + meuObject);
  }
}
