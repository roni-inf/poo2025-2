package exemplos;

import javax.swing.JOptionPane;

public class Comparar {
	
	public static void main(String[] args) {
		int num1 = 10, num2=5;
		String resultado;

		// TERNÁRIO
		//System.out.println(num1 > num2 ? "Num1 maior" : num2 > num1 ? "Num2  maior" : "Iguais");
		resultado = (num1 > num2 ? "Num1 maior" : num2 > num1 ? "Num2  maior" : "Iguais");
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null,resultado);
	} 
}
