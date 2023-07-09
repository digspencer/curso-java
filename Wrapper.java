package fundamentos;


public class Wrapper {
	
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");
		Long l = 100000L; // No caso do long precisa colocar o L no final do número
		
		System.out.println(b / 10);
		System.out.println(s / 10);
		System.out.println("i " + i / 1000);
		System.out.println(l / 10);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1223.13;
		System.out.println(d);
		
		// Nesse caso vai conseguir utilizar a notação ponto no tipo primitivo
		System.out.println(i);
		
		
		//Wrapper de Boolean
		Boolean bo = Boolean.parseBoolean("true");
		
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c + "...");
	}
}
