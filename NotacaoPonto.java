package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia x";
		s = s.toUpperCase().replace("X", "Senhora").concat("!!!");
		
		
		System.out.println(s);
		System.out.println("Di".toUpperCase());
		
	}
}
