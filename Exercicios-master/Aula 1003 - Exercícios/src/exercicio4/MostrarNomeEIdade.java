package exercicio4;

import javax.swing.JOptionPane;

public class MostrarNomeEIdade {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		JOptionPane.showMessageDialog(null, "Olá " + nome + ". Você tem  " + idade + " anos!");

	}

}
