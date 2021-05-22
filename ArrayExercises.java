import java.util.HashMap;
import java.util.Map;

public class ArrayExercises {

	public static void main(String args[]) {

		/**
		 * counts no of threes between range (BluePi)
		 */
		int count = 0;
		for (int x = 1; x <= 1000; x++) {
			char[] arr = String.valueOf(x).toCharArray();
			for (char a : arr) {
				if (a == '3') {
					System.out.println(x);
					count++;
				}
			}
		}
		System.out.println("occurrences of '3': " + count);

		/**
		 *  count occurrence of each element in given array (IHSMarkit)
		 */
		int[] array = { 1, 1, 2, 2, 2, 3, 4, 4, 4 };
		HashMap<Integer, Integer> arrCountMap = new HashMap<Integer, Integer>();
		for (int x = 0; x < array.length; x++) {
			if (arrCountMap.get(array[x]) != null) {
				int count1 = arrCountMap.get(array[x]);
				arrCountMap.put(array[x], count1 + 1);
			} else {
				arrCountMap.put(array[x], 1);
			}

		}
		for (Map.Entry<Integer, Integer> o : arrCountMap.entrySet())
			System.out.println(o.getKey() + "- " + o.getValue());
	}
}
