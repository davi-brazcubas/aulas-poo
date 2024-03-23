/**
 * C01TratamentoDeExcecoes
 * O tratamento de exceções é usado para lidar com erros que podem ocorrer
 * durante a execução do programa
 */
public class C01TratamentoDeExcecoes {

  public static void main(String[] args) {
    try {
      String nome = "João da Silva";
      System.out.println(nome.toUpperCase());

      nome = null;
      System.out.println(nome.toUpperCase());
    } catch (NullPointerException e) {
      System.out.println("Erro! Variável nula!");
    }
  }
}
