import java.util.ArrayList;

public class highlyDivisibleNumber {

	public static void main(String args[]) {

		int index = 1;
		int number = 1;

		do {

			number = triangleNumber(index);
			index++;
			System.out.println(number);
		} while (divisors(number) <= 500);

	}

	public static int triangleNumber(int number) {

		return number * (number + 1) / 2;

	}

	// returns the number of divisors
	public static int divisors(int number) {

		int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71 };
		ArrayList<Integer> primeExponents = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > number) {
				break;
			}
			primeExponents.add(primeFactorize(number, arr[i]));
		}

		return getNumberDivisors(primeExponents);

	}

	public static int primeFactorize(int number, int prime) {

		int exponents = 0;
		while (number % prime == 0) {
			number = number / prime;
			exponents++;
		}

		return exponents;
	}

	public static int getNumberDivisors(ArrayList<Integer> exponents) {

		int numberDivisors = 1;

		for (Integer x : exponents) {

			numberDivisors *= (x + 1);
		}
		return numberDivisors;

	}

}
