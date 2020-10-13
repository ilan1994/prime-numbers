import java.util.Scanner;

public class isPrimeNumber {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Which number you want to check ? ");
		int number = scanner.nextInt();
		print(number);
		//System.out.println(checkPrime(number));

	}
	
	public static void print(int number) {
		for(int i=2; i < number; i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	

	public static boolean checkPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number <= 1) {
				return true;
			}
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

}
