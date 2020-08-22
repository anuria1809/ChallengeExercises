/**
 * Code Ground: test 15-04-2018 solved
 * minimize the cost travel
 * 
 * Sample Input:-
 * N: 3 (countries)
 * Fares for three modes of transportation in each country:
 * C[0][0] = 10; C[0][1] = 12; C[0][2] = 9;
 * C[1][0] = 10; C[1][1] = 11; C[1][2] = 9;
 * C[2][0] = 15; C[2][1] = 9; C[2][2] = 16;
 * 
 * Calculate minimum cost of travel such that two consecutive travel modes are not used
 * Output: 9+10+9 = 28
 * 
 */

package self.practise;

public class LowestCostTravel {

	static int lowestFare(int N, int[][] C) {
		if (N >= 1 && N <= 10) {
			int[] min = new int[N];
			int lastIndex = 0;
			int total = 0;
			int[] max = new int[N];

			int j = 0;
			for (int i = 0; i < N; i++) {
				// find out the maximum cost for each country
				for (int k = 0; k < C[i].length; k++) {
					if (max[i] < C[i][k])
						max[i] = C[i][k];
				}
				min[i] = max[i];
//				System.out.println(max[i]);
				int within = -1;

				for (j = 0; j < C[i].length; j++) {
					if (i == 0) {
						if (min[i] > C[i][j]) {
							min[i] = C[i][j];
							lastIndex = j;
						}
					}
					else if (j != lastIndex && min[i] > C[i][j]) {
						min[i] = C[i][j];
						within = j;
//						System.out.println("within: "+within);
					}
					if(i!=0 && j==2) {
						lastIndex = within;
					}
				}
				System.out.println("lastIndex:----->>------- "+lastIndex);
				System.out.println("Travel cost:--------------------- " + min[i]);
				total += min[i];
			}
			return total;
		} else
			return 0;
	}

	public static void main(String[] args) {
		int N = 7;
		int[][] C = new int[N][3];
		C[0][0] = 10; C[0][1] = 11; C[0][2] = 9;
		C[1][0] = 9; C[1][1] = 10; C[1][2] = 16;
		C[2][0] = 9; C[2][1] = 9; C[2][2] = 16;
		C[3][0] = 15; C[3][1] = 9; C[3][2] = 16;
		C[4][0] = 15; C[4][1] = 9; C[4][2] = 16;
		C[5][0] = 15; C[5][1] = 9; C[5][2] = 7;
		C[6][0] = 15; C[6][1] = 9; C[6][2] = 16;
		System.out.println(lowestFare(N, C));
	}
}
