/**
 * pattern:
 * 1
 * 32
 * 456
 * 10987
 * 1112131415 and so on..
 */

package self.practise;

public class PatternNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;
		int k = 0;
		int arr[][] = new int[n][];
		for (int i = 1; i <= n; i++) {
			int arr1[] = new int[i];
			for (int j = 1; j <= i; j++) {
				arr1[j - 1] = ++k;
			}
			arr[i - 1] = arr1;
		}
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(arr[i - 1][j - 1]);
				}
			} else {
				for (int j = i; j >= 1; j--) {
					System.out.print(arr[i - 1][j - 1]);
				}
			}
			System.out.println();
		}
	}
}