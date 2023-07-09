package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá Pessoal".charAt(1));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		
		var nome = "Pedro";
		var sobrenome = "Matias";
		var idade = 33;
		var salario = 12345.45;
		
		System.out.printf("O senhor %s: %s tem %d anos e recebe R$ %.2f.", nome, sobrenome, idade, salario);
		String frase = String.format("O senhor %s: %s tem %d anos e recebe R$ %.2f..", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		
	}
}
