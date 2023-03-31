package cursojava.modulo08;

import java.util.Scanner;

public class ExercicioIfElse06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de lados do polígono: ");
		int nLados = input.nextInt();

		System.out.print("Digite a medida do lado do polígono (em cm): ");
		double medidaLado = input.nextDouble();

		double area;

		if (nLados == 3) {
			area = (medidaLado * medidaLado * Math.sqrt(3)) / 4;
			System.out.println("TRIÂNGULO - Área: " + area + " cm²");
		} else if (nLados == 4) {
			area = medidaLado * medidaLado;
			System.out.println("QUADRADO - Área: " + area + " cm²");
		} else if (nLados == 5) {
			System.out.println("PENTÁGONO");
		} else { 
            System.out.println("Este programa só funciona com polígonos de até 5 lados.");
		}
		
        input.close();

	}

}
