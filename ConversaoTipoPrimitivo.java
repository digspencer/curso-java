package fundamentos;

public class ConversaoTipoPrimitivo {

	
	public static void main(String[] args) {
		
		double a = 1;
		
		float b = (float)1.0; //Conversão explicita
		
		int c = 128;
		byte d = (byte)c; //Conversão explicita
		
		System.out.println(a + b + c + d);
	}
}
