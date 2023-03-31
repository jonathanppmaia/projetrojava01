package cursojava.modulo08;

public class OpLogicaAninhadasCase {

	public static void main(String[] args) {

		double nota1 = 90;
		double nota2 = 100;
		double nota3 = 100;
		double nota4 = 100;
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 50) {
			if(media >=70) {
				if (media > 90) {
					System.out.println("Aluno está aprovado direto, com média  " + media + " Parabéns");
				}else {
					System.out.println("Aluno está Aprovado Direto, com média  " + media);
				}
			}else {
				System.out.println("Aluno está em recuperação, com média  " + media);
			}
		}else {
			System.out.println("Aluno Reprovado direto, com média " + media);
		}
		
		
	}

}
