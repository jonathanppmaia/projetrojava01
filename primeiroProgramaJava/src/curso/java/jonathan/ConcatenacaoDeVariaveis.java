package curso.java.jonathan;

public class ConcatenacaoDeVariaveis {
	public static void main(String[] args) {
		/* Concatenação = Unir ou Juntar dados */

		String nome = "Jonathan";
		String cpf = "456.789.895-55";
		String telefone = "85 9875-1256";
		String endereco = "Fortal";
		int idade = 32;

		String saida = "Meu nome é: " + nome + " tenho idade: " + idade + " e o cpf: " + cpf + " meu contato é: "
				+ telefone + " e moro em: " + endereco;

		System.out.println(saida);

	}
}
