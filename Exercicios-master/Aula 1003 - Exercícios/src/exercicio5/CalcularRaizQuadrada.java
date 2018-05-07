package exercicio5;

import javax.swing.JOptionPane;

public class CalcularRaizQuadrada {

	public static void main(String[] args) {
		
		int a, b, c, delta;
		double x1, x2, x3;
		double raiz;
		
		// Variáveis da equação;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para b:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para c:"));
		
		delta = (b * b) - (4 * (a) * (c));
		//Cálculo do delta
		
		if(delta < 0) {
			JOptionPane.showMessageDialog(null, "Não há raízes reais:");
		}else {
		
		raiz = Math.sqrt(delta);
		
		x1 = (-b + raiz ) / (2 * a);
		x2 = (-b - raiz ) / (2 * a);
		//Cálculo da baskhara
		
		if(delta == 0) {
			x3 = ((-b) / 2 * a);
			//Cálculo da baskhara com uma raiz real
			
			JOptionPane.showMessageDialog(null, "A raiz é: " + x3);
		}else {
			JOptionPane.showMessageDialog(null, "As raízes são: " + x1  + "  " + x2);
		}
		
		}		

	}

}
