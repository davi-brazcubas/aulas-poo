/**
 * C01CondicionaisIf
 * Comandos condicionais são usados para tomar decisões com base em condições
 * específicas
 */
public class C01CondicionaisIf {

  public static void main(String[] args) {
    float nota = 7.5f;

    if (nota >= 6) {                      // expressão que retorna 'true' ou 'false' ou variável booleana
      // Bloco de código executado se a condição acima for verdadeira
      System.out.println("Aprovado");
    } else if (nota < 6 && nota >= 3) {   // expressão que retorna 'true' ou 'false' ou variável booleana
      // Bloco de código executado se a condição anterior for falsa e a condição acima for verdadeira
      System.out.println("Exame");
    } else {
      // Bloco de código executado se todas as condições anteriores forem falsas
      System.out.println("Reprovado");
    }
  }
}