package self.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lexicographical {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length
		// 'k'
		// 'largest' must be the lexicographically largest substring of length
		// 'k'
		int noOfWords = s.length() - k + 1;
		String array[] = new String[noOfWords];
		int j = 0;
		SortedSet<String> arraySet = new TreeSet<String>();
		if (s.length() <= 1000 && s.length() >= 1) {
			for (int i = 0; i < array.length; i++) {
				array[i] = s.substring(j, j + k);
				j++;
				arraySet.add(array[i]);
			}
			smallest = arraySet.first();
			largest = arraySet.last();
		}
		List<String> list = new ArrayList<String>(arraySet);
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		System.out.println();

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		String s ="anuria";
		int k = 3;

		System.out.println(getSmallestAndLargest(s, k));
	}
}
