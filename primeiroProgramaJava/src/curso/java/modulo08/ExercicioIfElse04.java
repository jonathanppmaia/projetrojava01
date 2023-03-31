package curso.java.modulo08;

import java.util.Scanner;

public class ExercicioIfElse04 {

	public static void main(String[] args) {
		
		//Escrever três números em ordem Crescente
		
		Scanner scanner = new Scanner(System.in);
		int a, b, c;

		System.out.print("Digite o primeiro valor : ");
		a = scanner.nextInt();

		System.out.print("Digite o Segundo valor : ");
		b = scanner.nextInt();
		
		System.out.print("Digite o terceiro valor : ");
		c = scanner.nextInt();
		
		if (a < b && a < c) {
			if ( b < c) {
				System.out.printf("%d, %d, %d", a, b, c);
			}else {
				System.out.printf("%d, %d, %d", a, c, b);
			}
		}else if (b < a && b < c ) {
			if (a < c) {
				 System.out.printf("%d, %d, %d", b, a, c);
			} else {
				System.out.printf("%d, %d, %d", b, c, a);
			}
		} else {
			if (a < b) {
                System.out.printf("%d, %d, %d", c, a, b);
            } else {
                System.out.printf("%d, %d, %d", c, b, a);
            }
		}
	}

}
