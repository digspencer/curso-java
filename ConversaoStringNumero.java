package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o Seguindo número");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		
		System.out.println(numero1 + numero2);
	}
}
