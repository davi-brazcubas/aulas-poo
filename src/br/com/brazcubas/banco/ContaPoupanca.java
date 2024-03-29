package br.com.brazcubas.banco;

/**
 * ContaPoupanca herda de ContaBancaria, logo, ContaPoupanca "é uma"
 * ContaBancaria
 */
public class ContaPoupanca extends ContaBancaria {

  /**
   * Sobrescrita do método sacar() da superclasse ContaBancaria
   * 
   * Quando uma nova ContaPoupanca for instanciada e o método for chamado, será
   * executado o método sobrescrito na subclasse ContaPoupanca. Além disso, o
   * método sobrescrito chama o mesmo método da superclasse por meio do 'super' que
   * dá acesso aos métodos da superclasse
   */
  @Override
  public void sacar(double valor) {
    if (this.saldo - valor < 0) {
      System.out.println("Saldo insuficiente!");
      return;
    }
    super.sacar(valor);
  }
}
