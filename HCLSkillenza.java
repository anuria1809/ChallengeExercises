import java.util.Scanner;

/**
 * 
 * Draw given string into patterns of Z eg.
 *
 * a b c d e f a b c d e f a b c d e f a b c d e f a b c d e f a b c d e f a b c
 * d e f a b c d
 *
 */

public class HCLSkillenza {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // no of test cases
		for (int i = 0; i < t; i++) {
			int l = sc.nextInt(); // length of string
			int h = sc.nextInt(); // height of Z
			int n = sc.nextInt(); // number of Z
			String str = sc.next(); // string

			if (l >= 1 && l <= 100 && h >= 1 && h <= 20 && n >= 1 && n <= 20) {
				int sizeX = h + 1;
				int sizeY = (h * n) + 1;
				int numOfCharsInSingleZ = (sizeX * 2 + (h - 1));
				int numOfCharsInOtherZ = (numOfCharsInSingleZ - sizeX) * (n - 1);
				int numOfChars = numOfCharsInSingleZ + numOfCharsInOtherZ;
				int strLen = str.length();
				StringBuffer zChar = new StringBuffer(numOfChars);
				if (strLen >= numOfChars) {
					zChar = zChar.append(str.substring(0, numOfChars));
				} else {
					int rem = numOfChars / strLen;
					int mod = numOfChars % strLen;
					for (int c = 0; c < rem; c++) {
						zChar.append(str);
					}
					zChar.append(str.substring(0, mod));
				}
				char[] charArray = zChar.toString().toCharArray();
				String arr[][] = new String[sizeY][];

				int counter = 0;
				if (h == 1) {
					for (int x = 1; x <= sizeY; x++) {
						String arr1[] = new String[sizeX];
						for (int y = 1; y <= sizeX; y++) {
							arr1[y - 1] = String.valueOf(charArray[counter]) + " ";
							counter++;
						}
						arr[x - 1] = arr1;
					}
				} else {
					for (int x = 1; x <= sizeY; x++) {
						String arr1[] = new String[sizeX];
						if (x % h == 1) {
							for (int y = 1; y <= sizeX; y++) {
								arr1[y - 1] = String.valueOf(charArray[counter]) + " ";
								counter++;
							}
						} else {
							for (int y = 1; y <= sizeX; y++) {
								if ((x % h == 0) && h == ((sizeX - y) + 1)) {
									arr1[y - 1] = String.valueOf(charArray[counter]) + " ";
									counter++;
								} else if ((x % h) == ((sizeX - y) + 1)) {
									arr1[y - 1] = String.valueOf(charArray[counter]) + " ";
									counter++;
								} else
									arr1[y - 1] = "  ";
							}
						}
						arr[x - 1] = arr1;
					}
				}
				for (int a = 0; a < sizeY; a++) {
					for (int b = 0; b < sizeX; b++) {
						System.out.print(arr[a][b]);
					}
					System.out.println();
				}
			}
		}
		sc.close();
	}
}
