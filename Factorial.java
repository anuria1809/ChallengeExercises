/**
 * Code Ground: https://codeground.in/code4/#/sampleTest?testId=25393455&redirectTo=%2FrapidTest%2F25393455%2FuserDetails%3Fcandidate%3D3a2cd09b753e581f2a7f036909f9bde%26email%3Danuria.aster92@gmail.com%26sessionId%3D6297409
 * challenge: 3
 */

package self.practise;

public class Factorial {

	public static void main(String[] args) throws InterruptedException {
		String line = "0";
		int factorial = 1;
		int num = Integer.parseInt(line);
		for (int n = 1; n <= num; n++) {
			factorial = factorial * n;
		}
		System.out.println(factorial);
	}
}
