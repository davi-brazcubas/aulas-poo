/**
 * C04Indentacao
 * Espaçamento usado para organizar visualmente o código
 * Geralmente é feita usando espaços ou tabulações para destacar blocos de código,
 * como loops, condicionais e definições de métodos
 */
public class C04Indentacao {

  public static void main(String[] args) {
    metodoIndentado();
    metodoNaoIndentado();
  }

  private static void metodoIndentado() { // 🗹 certo
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("Valores: " + i + " " + j);
      }
    }
  }

  private static void metodoNaoIndentado() { // 🗷 errado
  for (int i = 0; i < 5; i++) {
  for (int j = 0; j < 5; j++) {
  System.out.println("Valores: " + i  + " " + j);
  }
  }
  }
}
