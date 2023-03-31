package modulo08;

public class EstrutruradeRepeticaoFor {

	public static void main(String[] args) {

		/* Estrutura de repetição FOR e Continue*/

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero ==6 || numero ==9) {

				System.out.println("Obaaa, encontrei o numero  " + numero);
			
				continue;
			}
			
			System.out.println("Processando laço de repetição");
		}

	}

}
