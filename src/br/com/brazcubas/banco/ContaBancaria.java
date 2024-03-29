package br.com.brazcubas.banco;

public class ContaBancaria {
  protected double saldo;

  public void depositar(double valor) {
    this.saldo += valor;
    consultarSaldo();
  }

  public void sacar(double valor) {
    this.saldo -= valor;
    consultarSaldo();
  }

  public void consultarSaldo() {
    System.out.println("O saldo da conta é: %.2f".formatted(this.saldo));
  }
}
