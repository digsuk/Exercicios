package exercicio1;

import javax.swing.JOptionPane;

public class StringInversa {

	public static void main(String[] args) {
		
		String inverso = JOptionPane.showInputDialog("Informe algo a ser invertido:");
		int i;
		
		for(i = inverso.length()-1; i >= 0; i--) {
			System.out.print(inverso.charAt(i));
		}

	}

}