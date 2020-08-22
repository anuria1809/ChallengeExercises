/**
 * Code Ground: https://codeground.in/code4/#/sampleTest?testId=25393455&redirectTo=%2FrapidTest%2F25393455%2FuserDetails%3Fcandidate%3D3a2cd09b753e581f2a7f036909f9bde%26email%3Danuria.aster92@gmail.com%26sessionId%3D6297409
 * challenge: 1
 */

package self.practise;

public class CountNoOfSpaces {

	public static void main(String[] args) throws InterruptedException {
		String line = "   h  e ll o";
		int noOfSpaces = 0;
		char[] chars = line.toCharArray();
		for (int n = 0; n < chars.length; n++) {
			if (chars[n] == ' ') {
				noOfSpaces++;
			}
		}
		System.out.println(noOfSpaces);
	}
}