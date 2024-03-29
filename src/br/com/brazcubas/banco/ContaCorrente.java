package br.com.brazcubas.banco;

/**
 * ContaCorrente herda de ContaBancaria, logo, ContaCorrente "é uma"
 * ContaBancaria
 */
public class ContaCorrente extends ContaBancaria {

  private static double TARIFA_MENSAL = 2.5;

  private static double TAXA_SAQUE = 4.5;

  /**
   * Sobrescrita do método sacar() da superclasse ContaBancaria
   * 
   * Quando uma nova ContaCorrente for instanciada e o método for chamado, será
   * executado o método sobrescrito na subclasse ContaCorrente. Além disso, o
   * método sobrescrito chama outro método da superclasse por meio do 'super' que
   * dá acesso aos métodos da superclasse
   */
  @Override
  public void sacar(double valor) {
    this.saldo -= valor + TAXA_SAQUE;
    super.consultarSaldo();
  }

  /**
   * Implementação de método específico da ContaCorrente. Além disso, o
   * método chama outro método da superclasse por meio do 'super' que
   * dá acesso aos métodos da superclasse
   */
  public void cobrarTarifaMensal() {
    this.saldo -= TARIFA_MENSAL;
    super.consultarSaldo();
  }
}
