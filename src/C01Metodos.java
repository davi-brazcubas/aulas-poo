/**
 * C01Metodos
 * Métodos são blocos de código encapsulados que realizam uma tarefa específica
 * Eles podem aceitar parâmetros, executar operações e retornar valores
 */
public class C01Metodos {

  public static void main(String[] args) {
    metodosMatematicos();
    metodosDeString();
  }

  private static void metodosMatematicos() {
    System.out.println("Métodos matemáticos:\n");
    double numberFloor = Math.floor(12.9);
    System.out.println("Número arredondado para baixo: " + numberFloor);

    double numberCeil = Math.ceil(12.1);
    System.out.println("Número arredondado para cima: " + numberCeil);

    int num1 = 10;
    int num2 = 45;
    System.out.println("O menor entre " + num1 + " e " + num2 + " é: " + Math.min(num1, num2));
    System.out.println("O maior entre " + num1 + " e " + num2 + " é: " + Math.max(num1, num2));

    double base = 2;
    double exponent = 3;
    System.out.println("Número " + base + " elevado a " + exponent + " é igual a " + Math.pow(base, exponent));

    System.out.println("Número aleatório entre 0.0 e 1.0: " + Math.random());

    System.out.println("\n\n");
  }

  private static void metodosDeString() {
    System.out.println("Métodos de String:\n");
    String helloWorld = "Hello, World!";

    System.out.println("String: " + helloWorld);

    System.out.println("Tamanho da String: " + helloWorld.length());

    System.out.println("Caractere da String na posição 7: " + helloWorld.charAt(7));

    System.out.println("Texto em maiúsculo: " + helloWorld.toUpperCase());

    System.out.println("Texto em minúsculo: " + helloWorld.toLowerCase());

    System.out.println("Substring: " + helloWorld.substring(8));

    System.out.println("Substring: " + helloWorld.substring(8, 11));

    System.out.println("Substituição de parte da String: " + helloWorld.replace("World", "Braz Cubas"));

    String formatted1 = String.format("String com o nome '%s' e o valor '%d'", "Minha String", 10);
    System.out.println(formatted1);

    String formatted2 = String.format("String com o valor '%.2f' e '%.3f'", 10.12121, 45.5454545);
    System.out.println(formatted2);
  }
}
