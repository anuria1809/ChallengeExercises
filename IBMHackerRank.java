import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author anuri
 * 
 * Accept a list of strings and check for occurrences of anagrams
 * Remove anagrams from the list keeping the first word in the list
 * Show the sorted final list
 * 
 */
public class IBMHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listStr = new ArrayList<String>();
		listStr.add("code");
		listStr.add("doce");
		listStr.add("ecod");
		listStr.add("framer");
		listStr.add("frame");
		List<String> listStrToRemove = new ArrayList<String>();
		int size = listStr.size();

		for (int i = 0; i < size - 1; i++) {
			String first = listStr.get(i);
			int x = i + 1;
			for (int j = x; j < size; j++) {
				String next = listStr.get(j);
				boolean isAnagram = isAnagrams(first, next);
				if (isAnagram) {
//					System.out.println(first + "==" + next + " index(" + i + "," + j + ")");
					listStrToRemove.add(next);
				}
			}
		}
		listStr.removeAll(listStrToRemove);
		Collections.sort(listStr);
		System.out.print("Final sorted List after removal of anagrams:-----");
		for (String s : listStr)
			System.out.print(s + ",");

	}

	static boolean isAnagrams(String a, String b) {
		List<Character> charSet1 = new ArrayList<Character>();
		List<Character> charSet2 = new ArrayList<Character>();
		char[] firstArr = a.toCharArray();
		char[] nextArr = b.toCharArray();
		for (char c : firstArr) {
			charSet1.add(c);
		}
		for (char c : nextArr) {
			charSet2.add(c);
		}
		boolean isequal = charSet1.containsAll(charSet2) && charSet1.size() == charSet2.size();
		return isequal;
	}

}
