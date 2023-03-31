package curso.java.jonathan;

public class PrimeiraClasse {

	public class PrimeiraClasseJava {

		/* Variavel Global é acessivel a todos */
		static int maiorIdadeGlobal = 30;

		/* Main é um método executavel em java */
		public static void main(String[] args) {

			/* Escreve texto no console */
			System.out.println("Meu primeiro Programa em Java do Curso Formação Java Web");
			System.out.println("Java é orientado a objetos");

			/* Variável local por que pertence somente a esse método */
			int maiorIdade = 18;

			metodo2();
		}

		public static void metodo2() {
			System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
		}

	}
}