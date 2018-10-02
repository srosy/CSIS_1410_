/**
 * Recursion (calls itself)
 * Error Handling
 * Iteration (factorials)
 */

package recursion;

public class DemoSumRecursion {

	public static void main(String[] args) {
		int n = 3;
		System.out.printf("sum(%d) = %d%n", n, sum(n));

	}

	private static int sum(int n) { // recursion
		if (n <= 0) {
			throw new IllegalArgumentException("To calculate the sum of n, n needs to be positive"); // error handling
		}
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1); // it's literally calling itself 'sum(int n)'
	}
}
