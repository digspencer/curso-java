package fundamentos;

import java.math.BigDecimal;

public class bigDecimal {

	public static void main(String[] args) {
		
		//A classe BigDecimal é utilizada para trabalhar com extrema precisão dos números
		//Existem 3 métodos | add = soma, subtract = subtração, multiply = multiplicação e divide = divisão
		
		BigDecimal valor1 = new BigDecimal(10);
		BigDecimal valor2 = new BigDecimal(20);
		
		BigDecimal resultado;
		
		resultado = valor1.add(valor2);
		
		System.out.println(resultado);
		
	}
	
}
