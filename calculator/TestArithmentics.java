package calculator;

public class TestArithmentics {

	public static void main(String[] args) {

		int num1 = 15, num2 = 5;
		Arithmentics arithmentics = new Arithmentics();
		
		System.out.println("Entered Numbers are: First Number = " + num1 + ", Second Number = " + num2);
		
		arithmentics.add(num1, num2);
		arithmentics.sub(num1, num2);
		arithmentics.multi(num1, num2);
		arithmentics.div(num1, num2);
		
	}
}