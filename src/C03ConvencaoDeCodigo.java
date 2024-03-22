/**
 * C03ConvencaoDeCodigo
 * Nomes de classes com a primeira letra maiúscula (Upper CamelCase)
 * Nomes de métodos, atributos e variáveis com a primeira letra minúscula (camelCase)
 * Constantes em caixa alta e com underline
 */
public class C03ConvencaoDeCodigo {      // 🗹 certo
// public class convencaoDeCodigo {      // 🗷 errado
  
  private static String nomeDoUsuario = "Usuário correto";  // 🗹 certo

  private static String NomeDoUsuario = "Usuário errado";   // 🗷 errado

  private static final int IDADE_MINIMA = 18;               // 🗹 certo

  private static final int idadeMinima = 18;                // 🗷 errado

  public static void main(String[] args) {
    imprimeNomeDoUsuario();
    ImprimeNomeDoUsuario();
  }

  private static void imprimeNomeDoUsuario() {  // 🗹 certo
    System.out.println(nomeDoUsuario);
    System.out.println(IDADE_MINIMA);
  }

  private static void ImprimeNomeDoUsuario() {  // 🗷 errado
    System.out.println(NomeDoUsuario);
    System.out.println(idadeMinima);
  }
}
