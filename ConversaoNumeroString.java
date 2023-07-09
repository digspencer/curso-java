package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // converte para String utilizando o .toString
	
		int num2 = 10000;
		System.out.println(Integer.toString(num2)); // converte também para String porém utiliza do Wrapper

	}
}