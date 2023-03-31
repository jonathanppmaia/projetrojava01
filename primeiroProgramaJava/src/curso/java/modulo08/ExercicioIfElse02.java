package curso.java.modulo08;

import java.util.Scanner;

public class ExercicioIfElse02 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);


		 System.out.print("Digite o ano do seu nascimento: ");
		  int ano = scanner.nextInt();
		  
		  int dataTotal = 2023 - ano;
	        
		
		if( dataTotal >=16) {
			System.out.println("Você tem " + dataTotal + "e já pode votar" );
		}else {
			System.out.println("Você tem " + dataTotal + " anos e infelizmente não pode votar.");
		}

	}

}
