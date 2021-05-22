import java.util.Scanner;

/**
 * 
 */

/**
 * @author anuri
 *
 *         Description: Code Gladiators 2021 Test 2 Find the max difference
 *         between prime numbers in given range
 * 
 */
public class CodeGladiator2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		sc.nextLine();
		int line = 1;

		if (N >= 1 && N <= 10) {
			while (line<=N) {
				sc.nextLine();
				int L = Integer.parseInt(sc.next());
				int R = Integer.parseInt(sc.next());
				if (L >= 2 && R >= 2 && L <= 1000000 && R <= 1000000) {

					int p1 = 0, p2 = 0;
					for (int i = L; i <= R; i++) {

						boolean isPrime = true;
						for (int j = 2; j <= i / 2; ++j) {
							if (i % j == 0) {
								isPrime = false;
								break;
							} else
								isPrime = true;
						}

						// if (CodeGladiator2.isPrime(i)) {
						if (isPrime) {
							if (p1 == 0)
								p1 = i;
							else
								p2 = i;
						}
					}
					// System.out.println(p1 + " and " + p2);
					if (p1 == 0 && p2 == 0)
						System.out.println("-1");
					else if (p1 == 0 || p2 == 0)
						System.out.println("0");
					else {
						System.out.println(p2 - p1);
					}

				} else
					System.out.println("-1");
				line++;
			}
		}
		sc.close();
	}

	static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int j = 2; j <= num / 2; ++j) {
			if (num % j == 0) {
				isPrime = false;
				break;
			} else
				isPrime = true;
		}
		return isPrime;
	}
}
