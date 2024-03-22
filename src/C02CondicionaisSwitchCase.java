/**
 * C02CondicionaisSwitchCase
 * Comandos condicionais são usados para tomar decisões com base em condições
 * específicas
 */
public class C02CondicionaisSwitchCase {

  public static void main(String[] args) {
    int diaDaSemana = 2;

    switch (diaDaSemana) {
      case 0:
        System.out.println("Domingo");
        break;
      case 1:
        System.out.println("Segunda-feira");
        break;
      case 2:
        System.out.println("Terça-feira");
        break;
      case 3:
        System.out.println("Quarta-feira");
        break;
      case 4:
        System.out.println("Quinta-feira");
        break;
      case 5:
        System.out.println("Sexta-feira");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Dia inválido");
        break;
    }

    // Opção a partir do Java 14
    switch (diaDaSemana) {
      case 0 -> System.out.println("Domingo");
      case 1 -> System.out.println("Segunda-feira");
      case 2 -> System.out.println("Terça-feira");
      case 3 -> System.out.println("Quarta-feira");
      case 4 -> System.out.println("Quinta-feira");
      case 5 -> System.out.println("Sexta-feira");
      case 6 -> System.out.println("Sábado");
      default -> System.out.println("Dia inválido");
    }
  }
}
