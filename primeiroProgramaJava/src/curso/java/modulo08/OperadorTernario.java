package curso.java.modulo08;

public class OperadorTernario {

	public static void main(String[] args) {

		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 30;
		double nota4 = 38;
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		
		/* Condições lógica com IF e ELSE */
//		if (media >= 70) {
//			System.out.println("Aluno aprovado: " + media);
//		}
//		if (media >= 40 && media <= 69) {
//			System.out.println("Alino em recuperação: " + media);
//		} else {
//			System.out.println("ALuno reprovado: " + media);
//		}
		
		/*Operadores ternários são para micro validações */
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado" :  (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);

	}

}
