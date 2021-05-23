/**
 * Code Ground: https://codeground.in/code4/#/sampleTest?testId=25393455&redirectTo=%2FrapidTest%2F25393455%2FuserDetails%3Fcandidate%3D3a2cd09b753e581f2a7f036909f9bde%26email%3Danuria.aster92@gmail.com%26sessionId%3D6297409
 * challenge: 3
 */

package anu.challenge.exercises;

public class Factorial {

	public static void main(String[] args) throws InterruptedException {
		int number = 10;
		/**
		 * factorial using loop
		 */
		int factorial = 1;
		for (int n = number - 1; n >= 1; n--) {
			factorial = factorial * n;
		}
		System.out.println("factorial using loop-> " + factorial);
		/**
		 * factorial using recursion
		 */
		int fact = factorial(number);
		System.out.println("factorial using recusrion->" + fact);
	}

	static int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return (num * factorial(num-1));
	}
}
