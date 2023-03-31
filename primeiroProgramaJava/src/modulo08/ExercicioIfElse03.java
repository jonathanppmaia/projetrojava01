package modulo08;

import java.util.Scanner;

public class ExercicioIfElse03 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);


		 System.out.print("Digite a senha de acesso: ");
		  int password = scanner.nextInt();
		  
		 	        
		
		if( password == 1234) {
			System.out.println("ACESSO	PERMITIDO" );
		}else {
			System.out.println("ACESSO	NEGADO");
		}

	}

}
