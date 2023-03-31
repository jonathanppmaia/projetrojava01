package modulo08;

public class EstrutruradeRepeticaoWhile {

	public static void main(String[] args) {
		/* COndição sempre verdadeira, vai rodar quando ficar falsa vai oarar*/
		
		
		int numero = 0;
		
		while (numero <= 3) { /*Verifica e executa o código*/
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		
		/* ---------------------------------- */
		
		
		int numero2 = 0;
		
		do {/*Primeiro executa depois verifica*/
			
			System.out.println("IO número atual é : " + numero2);
			numero2++;
			
		}while(numero2 <= 60);
		
	}

}
