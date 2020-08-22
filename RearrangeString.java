/**
 * Code Ground: https://codeground.in/code4/#/sampleTest?testId=25393455&redirectTo=%2FrapidTest%2F25393455%2FuserDetails%3Fcandidate%3D3a2cd09b753e581f2a7f036909f9bde%26email%3Danuria.aster92@gmail.com%26sessionId%3D6297409
 * challenge: 2
 */

package self.practise;

public class RearrangeString {

	public static void main(String[] args) throws InterruptedException {
		String line = "10101110001";

		int noOf1 = 0;
		int noOf0 = 0;
		char[] char1;
		char[] char0;
		char[] charArr;
		int x = 0;
		int y = 0;

		charArr = line.toCharArray();
		for (int n = 0; n < charArr.length; n++) {
			if (charArr[n] == '1') {
				noOf1++;
			} else {
				noOf0++;
			}
		}
		char1 = new char[noOf1];
		char0 = new char[noOf0];
		for (int n = 0; n < charArr.length; n++) {
			if (charArr[n] == '1') {
				char1[x] = charArr[n];
				x++;
			} else {
				char0[y] = charArr[n];
				y++;
			}
		}
		String s1 = new String(char1);
		String s2 = new String(char0);
		s1 = s1+s2;
		System.out.println(s1);
	}
}
