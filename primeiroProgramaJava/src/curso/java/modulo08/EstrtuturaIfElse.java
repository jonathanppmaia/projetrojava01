package curso.java.modulo08;

public class EstrtuturaIfElse {
	public static void main(String[] args) {
		
		int mediaAluno = 70;
		String nome = "Alex";
		
		if(mediaAluno >= 70 && nome.equals("Jonathan")) {
			System.out.println("Parabéns você está Aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("você está reprovado");
		}else {
			System.out.println("Aluno não encontrado");
		}
	}

}
