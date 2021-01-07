
public class Calculator {
	
	public static double add(double first, double second) {
		return first + second;
	}

	public static double subtract(double first, double second) {
		return first - second;
	}

	public static double multiply(double first, double second) {
		return first * second;
	}

	public static double divide(double first, double second){
		if(second == 0)
			throw new ArithmeticException();
		return first / second;
	}
	
	public static double squar(double number) {
		return multiply(number, number);
	}
	
	public static double squareRoot(double number) {
		if(number == 2 | number == 1)
			return number;
		double t;
		double squareRoot = number / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);

		return squareRoot;
	}
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number/2; i++) {
			if(number%i == 0)
				return false;
		}
		return true;
	}
}
