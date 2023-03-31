package modulo08;

public class EstrtuturaIfElse2 {
	public static void main(String[] args) {
		
		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 40;
		double nota4 = 48;
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >=70) {
			System.out.println("Aluno aprovado: " + media);
		} if ( media >= 40 && media <= 69) {
			System.out.println("Alino em recuperação: " + media);
		}else {
			System.out.println("ALuno reprovado: " + media);
		}

	}

}
