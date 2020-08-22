/**
 * HackerRank
 * challenge: https://www.hackerrank.com/challenges/ctci-making-anagrams
 */

package self.practise;

public class MakeAnagrams {
	public static int numberNeeded(String first, String second) {
		int num = 0;
		if (first.length() > 0 && first.length() <= 10000 && second.length() > 0 && second.length() <= 10000) {
			char[] aCharArray = first.toCharArray();
			char[] bCharArray = second.toCharArray();
			for (int i = 0; i < aCharArray.length; i++) {
				for (int j = 0; j < aCharArray.length; j++) {
					if (aCharArray[i] < aCharArray[j]) {
						char temp = aCharArray[i];
						aCharArray[i] = aCharArray[j];
						aCharArray[j] = temp;
					}
				}
			}
			for (int i = 0; i < bCharArray.length; i++) {
				for (int j = 0; j < bCharArray.length; j++) {
					if (bCharArray[i] < bCharArray[j]) {
						char temp = bCharArray[i];
						bCharArray[i] = bCharArray[j];
						bCharArray[j] = temp;
					}
				}
			}
			String aString = new String();

			int yesA = 0;
			int yesB = 0;
			for (int i = 0; i < aCharArray.length; i++) {
				for (int j = i; j < aCharArray.length; j++) {
					if (aCharArray[i] == aCharArray[j]) {
						yesA++;
					}
				}
				for (int j = 0; j < bCharArray.length; j++) {
					if (aCharArray[i] == bCharArray[j]) {
						yesB++;
					}
				}
				if (yesA > 0 || yesB > 0) {
					int yes = 0;
					if (yesA >= yesB) {
						yes = yesB;
					} else if (yesB > yesA) {
						yes = yesA;
					}
					String as = "" + aCharArray[i];
					if (!aString.contains(as)) {
						for (int count = 0; count < yes; count++) {
							aString = aString.concat(as);
						}
					}
				}
				yesA = 0;
				yesB = 0;
			}
			// System.out.println(aString);
			num = first.length() - aString.length();
			num = num + second.length() - aString.length();
		}
		return num;
	}

	public static void main(String[] args) {
		String a = "pxavnqfmhmgdleebjbcihnlfchrvgrgjgdlbsdiflwlo";
		String b = "abcepppqqqwwghljgdtfuhklcc";
		System.out.println(numberNeeded(a, b)); // abccdefgghhjllpqw
	}
}