import br.com.brazcubas.zoo.Cachorro;
import br.com.brazcubas.zoo.Gato;

/**
 * Crie uma superclasse Animal com um método fazerBarulho()
 * 
 * Em seguida, crie duas subclasses, Cachorro e Gato, que sobrescrevem o método
 * fazerBarulho()
 * 
 * Além disso, sobrecarregue o método fazerBarulho() na classe Cachorro para
 * aceitar um parâmetro que indica o número de vezes que o cachorro deve latir
 */
public class C01Principal {

	public static void main(String[] args) {
		Cachorro doguinho = new Cachorro();
		doguinho.fazerBarulho();
		doguinho.fazerBarulho(4);

		System.out.println();

		Gato gatinho = new Gato();
		gatinho.fazerBarulho();
	}

}
