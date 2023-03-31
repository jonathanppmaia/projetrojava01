package modulo08;

import java.util.Scanner;

public class ExercicioIfElse05 {

	public static void main(String[] args) {
				
		
		Scanner input = new Scanner(System.in);
		
			
		System.out.print("Digite a altura da pessoa em metros (1,75): ");
        double altura = input.nextDouble();
        
        System.out.print("Digite o sexo da pessoa (1 para feminino ou 2 para masculino): ");
        int sexo = input.nextInt();

		double pesoIdeal;
		
		if (sexo == 1) {
			
			pesoIdeal = (62.1 * altura)- 44.7;
			
		}else {
			
			pesoIdeal = (72.7 * altura) - 58;
			
		}
		
		System.out.printf("O peso ideal para uma pessoa com altura %.2f m e sexo %d é %.2f kg.", altura, sexo, pesoIdeal);
		
		
		input.close();
	}

}
