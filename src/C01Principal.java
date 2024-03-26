import br.com.brazcubas.exercicio.Aluno;
import br.com.brazcubas.exercicio.Calculadora;
import br.com.brazcubas.exercicio.Carro;
import br.com.brazcubas.exercicio.ContaBancaria;
import br.com.brazcubas.exercicio.IdadePessoa;
import br.com.brazcubas.exercicio.Livro;
import br.com.brazcubas.exercicio.Musica;
import br.com.brazcubas.exercicio.Pessoa;
import br.com.brazcubas.exercicio.Produto;

/**
 * Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
 * 
 * Crie uma classe Calculadora com um método que recebe um número como parâmetro
 * e retorna o dobro desse número.
 * 
 * Crie uma classe Musica com atributos titulo, artista, anoLancamento,
 * avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a
 * música e calcular a média de avaliações.
 * 
 * Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a
 * ficha técnica e calcular a idade do carro.
 * 
 * Crie uma classe ContaBancaria com os seguintes atributos: numeroConta
 * (privado), saldo (privado) e titular (publico). Implemente métodos getters e
 * setters para os atributos privados.
 * 
 * Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize
 * métodos getters e setters para acessar e modificar esses atributos. Adicione
 * um método verificarIdade que imprime se a pessoa é maior de idade ou não.
 * 
 * Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize
 * métodos getters e setters para acessar e modificar esses atributos. Adicione
 * um método aplicarDesconto que recebe um valor percentual e reduz o preço do
 * produto.
 * 
 * Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize
 * métodos getters e setters para acessar e modificar esses atributos. Adicione
 * um método calcularMedia que retorna a média das notas do aluno.
 * 
 * Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize
 * métodos getters e setters para acessar e modificar esses atributos. Adicione
 * um método exibirDetalhes que imprime o título e o autor do livro.
 */
public class C01Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.dizerOla();

		Calculadora calculadora = new Calculadora();
		System.out.println("Dobro de 5: " + calculadora.dobrar(5));

		Musica musica = new Musica();
		musica.setTitulo("Vilarejo");
		musica.setArtista("Marisa Monte");
		musica.setAnoLancamento(2005);
		musica.exibirFichaTecnica();
		musica.avaliar(10);
		musica.avaliar(8);
		musica.avaliar(6);
		System.out.println("Média Avaliações: " + musica.calcularMediaAvaliacoes());

		Carro carro = new Carro("Fusca", 1995, "Azul");
		carro.exibirFichaTecnica();

		ContaBancaria conta = new ContaBancaria();
		conta.setNumeroConta(12345);
		conta.setSaldo(1000);
		System.out.println("Número da conta: " + conta.getNumeroConta());
		System.out.println("Saldo: " + conta.getSaldo());

		IdadePessoa pessoaIdade = new IdadePessoa();
		pessoaIdade.setNome("João");
		pessoaIdade.setIdade(25);
		pessoaIdade.verificarIdade();

		Produto produto = new Produto();
		produto.setNome("Notebook");
		produto.setPreco(2000);
		produto.aplicarDesconto(10);
		System.out.println("Preço com desconto: " + produto.getPreco());

		Aluno aluno = new Aluno();
		aluno.setNome("Maria");
		aluno.addNota(7.5);
		aluno.addNota(8.5);
		aluno.addNota(4.5);
		System.out.println("Média do aluno: " + aluno.calcularMedia());

		Livro livro = new Livro();
		livro.setTitulo("Dom Casmurro");
		livro.setAutor("Machado de Assis");
		livro.exibirDetalhes();
	}

}
