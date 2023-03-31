package curso.java.modulo08;

import javax.swing.JOptionPane;

public class CalculoDeMedia {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

		/* VARI�VEL CONVERTIDA PARA DOUBLE */
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		/* M�dia para aprova��o � 70 */

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno est� aprovado com m�dia de: " + media);

			} else {
				JOptionPane.showMessageDialog(null, "Aluno em recupera��o com m�dia: " + media);
			}
		} else {

			JOptionPane.showMessageDialog(null, "Aluno reprovado com m�dia: " + media);

		}

	}
}
