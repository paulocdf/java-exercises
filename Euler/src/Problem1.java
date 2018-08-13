// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

public class Problem1 {

	public static void main(String[] args) {
		int number = 999;
		int result = 0;
		while(number >= 0) {
//			System.out.println("Number: " + number);
			if((number % 3 == 0) || (number % 5 == 0)) {
				System.out.println(number);
				result += number;
			}
			number--;
		}
		System.out.println("Result: " + result);
	}

}
