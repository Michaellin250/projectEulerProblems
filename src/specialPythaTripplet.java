
public class specialPythaTripplet {

	public static void main(String[] args) {

		for (int a = 0; a <= 1000; a++) {

			for (int b = 0; b <= 1000; b++)

				for (int c = 0; c <= 1000; c++) {

					if ((a<b) && (b<c) && isTripplet(a, b, c) && ((a+b+c) == 1000)) {
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);

					}

				}

		}

	}


	public static boolean isTripplet(int a, int b, int c) {

		double squaredA = Math.pow(a, 2);
		double squaredB = Math.pow(b, 2);
		double squaredC = Math.pow(c, 2);

		if ((squaredA + squaredB) == squaredC) {

			return true;

		}

		else {
			return false;
		}

	}

}
