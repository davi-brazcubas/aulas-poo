package br.com.brazcubas.zoo;

/**
 * Gato herda de Animal, logo, Gato "é um" Animal
 */
public class Gato extends Animal {

  /**
   * Sobrescrita do método fazerBarulho() da superclasse Animal
   * 
   * Quando um novo Gato for instanciado e o método for chamado, será
   * executado o método sobrescrito na subclasse Gato
   */
  @Override
  public void fazerBarulho() {
    System.out.println("O gato mia!");
  }

}
