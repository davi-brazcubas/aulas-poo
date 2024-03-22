/**
 * C02CaseSensitive
 * Variáveis declaradas com Nome e nome são tratadas como diferentes em Java
 */
public class C02CaseSensitive {
  
  public static void main(String[] args) {
    int idade = 25;
    int Idade = 18;

    System.out.println(idade); // imprime 25
    System.out.println(Idade); // imprime 18
  }
}
