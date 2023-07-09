package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informação de funcionários
		
		//tipos numéricos inteiros
		byte anoDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // Se usarmos o L maiúsculo no final do número dizemos que é um literal do tipo long
		
		//Tipos numéricos reais
		float salario = 11_445.44F; // Se quiser escrever um literal float coloca-se um F no final do número
		double vendasAcumuladas = 2_991_797_103.01;		
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//tipo caracter
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anoDeEmpresa * 365 + " dias");
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2 + " viagens");
		
		//Pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//identificar usuario
		System.out.println("O " + id + " :recebe " + salario);
		
		//Verificar as férias
		System.out.println("Férias ?" + estaDeFerias);
		
		//status
		System.out.println("status: " + status);
		
 	}	
}

