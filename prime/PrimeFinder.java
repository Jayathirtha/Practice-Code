package prime;

public class PrimeFinder {

	public void findPrime(int num) {
		boolean flag = false;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (!flag) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
	}
}