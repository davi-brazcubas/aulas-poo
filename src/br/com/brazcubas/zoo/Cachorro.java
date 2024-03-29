package br.com.brazcubas.zoo;

/**
 * Cachorro herda de Animal, logo, Cachorro "é um" Animal
 */
public class Cachorro extends Animal {

  /**
   * Sobrescrita do método fazerBarulho() da superclasse Animal
   * 
   * Quando um novo Cachorro for instanciado e o método for chamado, será
   * executado o método sobrescrito na subclasse Cachorro
   */
  @Override
  public void fazerBarulho() {
    System.out.println("O cachorro late!");
  }

  /**
   * Sobrecarga do método fazerBarulho() com parâmetros diferentes do método
   * anterior
   */
  public void fazerBarulho(int vezes) {
    for (int i = 0; i < vezes; i++) {
      System.out.println("Au au");
    }
  }
}
