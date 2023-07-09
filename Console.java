package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.println("Bom");

		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Salário: %.1f %n", 1234.5678); // %n pula a próxima linha
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		System.out.println("O nome digitado foi " + nome + " " + sobrenome + " " + "" + idade + " anos de idade");
		entrada.close();
	}	
}