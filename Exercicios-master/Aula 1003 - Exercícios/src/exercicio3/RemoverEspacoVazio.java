package exercicio3;

import javax.swing.JOptionPane;

public class RemoverEspacoVazio {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Informe uma palavra:");
		int i;
		int contA = 0;//Contador das letras 'a'

		for(i = 0; i <= palavra.length()-1; i++) {
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
				contA++;
				
			}
				
		}
		
		palavra = palavra.replace('a', ' ');
		
	    String[] array = new String[contA];
	    array = palavra.split(" ");
	    
	    System.out.print("Palavra final:\n");
	    
	    for(i = 0; i <= contA-1; i++) {
	    	
	    	System.out.print(array[i]);	    		     	
	    } 
	    
	    System.out.println("\nQuantidade de espaços vazios:\n" + contA);
	}

}