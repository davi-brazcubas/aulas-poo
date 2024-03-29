import br.com.brazcubas.banco.ContaCorrente;
import br.com.brazcubas.banco.ContaPoupanca;

/**
 * Crie uma classe ContaBancaria com métodos para realizar operações bancárias
 * como depositar(), sacar() e consultarSaldo()
 * 
 * Em seguida, crie subclasses ContaCorrente e ContaPoupanca que herdam da
 * classe ContaBancaria
 * 
 * Adicione um método específico para a subclasse ContaCorrente, como
 * cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente
 * 
 * Sobrescreva o método sacar() na classe ContaCorrente e inclua uma taxa de
 * saque a cada saque, mas permita saques mesmo que o saldo fique negativo
 * 
 * Sobrescreva o método sacar() na classe ContaPoupanca não permitindo que o
 * saldo fique negativo
 */
public class C01Principal {

	public static void main(String[] args) {
		System.out.println("Conta Corrente");
		ContaCorrente minhaConta = new ContaCorrente();
		minhaConta.depositar(100);
		minhaConta.depositar(50);
		minhaConta.sacar(50);
		minhaConta.sacar(200);
		minhaConta.cobrarTarifaMensal();

		System.out.println("\nConta Poupança");
		ContaPoupanca minhaPoupanca = new ContaPoupanca();
		minhaPoupanca.depositar(100);
		minhaPoupanca.depositar(50);
		minhaPoupanca.sacar(50);
		minhaPoupanca.sacar(200);
	}

}
