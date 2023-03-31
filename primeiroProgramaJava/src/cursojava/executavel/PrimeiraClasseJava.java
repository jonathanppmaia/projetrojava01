package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Variavel Global é acessivel a todos e o seu valor é compartilhado */
	static int maiorIdadeGlobal = 30;

	
	/* Main é um método executavel em java */
	public static void main(String[] args) {

		/* Escreve texto no console */
		System.out.println("Meu primeiro Programa em Java do Curso Formação Java Web");
		System.out.println("Java é orientado a objetos");

		/* Variável local por que pertence somente a esse método e o valor fica dentro do  método */
		int maiorIdade = 18;
		System.out.println("Valor variável Local= "+ maiorIdade);
		System.out.println("Valor variável Global= "+ maiorIdadeGlobal);
		
		metodo2();
	}

	
	public static void metodo2() {
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	}

}
