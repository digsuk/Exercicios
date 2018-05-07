package exercicio2;

import javax.swing.JOptionPane;

public class TrocarLetraAporB {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Informe uma palavra:");
		int i;
		int contA = 0;//Contador das letras 'a'

		for(i = palavra.length()-1; i >= 0; i--) {
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
				contA++;
				
			}
				
		}
		
		palavra = palavra.replace('a', 'b');
		
	    JOptionPane.showMessageDialog(null, "Palavra trocada:\n" + palavra + "\n\nLetras trocadas\n" + contA);
	}

}