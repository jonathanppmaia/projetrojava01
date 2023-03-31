package cursojava.modulo08;

public class EstrutruradeRepeticaoFor2 {

	public static void main(String[] args) {

//		for (int numero = 0; numero <= 10; numero ++){
//			System.out.println("Numero atual é : " + numero);
//		}

//		for (int numero = 10; numero >= 0; numero --){
//			System.out.println("Numero atual é : " + numero);
//		}

		/* FOR com Break (Parada) */

		for (int numero = 0; numero >= 10; numero++) {
			if (numero == 8) {

				System.out.println("Obaaa, encontrei o numero  " + numero);
				System.out.println("estou parando de executar ...");
				break;
			}
		}

	}

}
