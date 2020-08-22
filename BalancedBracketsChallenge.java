/**
 * HackerRank
 * challenge: https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
 */

package self.practise;

import java.util.HashMap;
import java.util.Map;

public class BalancedBracketsChallenge {

	public static boolean isBalanced(String expression) {

		char[] openBrackets = { '(', '{', '[' };
		char[] closedBrackets = { ')', '}', ']' };
		Map<Character, Character> bracketMap = new HashMap<>();
		bracketMap.put('(', ')');
		bracketMap.put('{', '}');
		bracketMap.put('[', ']');

		int noOfOpen = 0;
		int noOfClose = 0;
		char[] expressionArr = expression.toCharArray();
		for (int i = 0; i < expressionArr.length; i++) {
			for (int j = 0; j < openBrackets.length; j++) {
				if (expressionArr[i] == openBrackets[j])
					noOfOpen++;
				else if (expressionArr[i] == closedBrackets[j])
					noOfClose++;
			}
		}

		if (noOfClose == noOfOpen) {
			int count = 0;
			int lastCount = 0;

			for (int x = 0; x < expressionArr.length; x++) {
				for (char ob : openBrackets) {
					if (expressionArr[x] == ob) {
						for (int y = x; y < expressionArr.length; y++) {
							if (expressionArr[y] == bracketMap.get(expressionArr[x])) {
								if ((y - x) % 2 == 0) {
								} else {
									System.out.println(x + " " + y);
									count++;
								}
								if (count > lastCount) {
									lastCount = count;
									break;
								}
							}
						}
					}
				}
			}
			if (count == noOfClose)
				return true;
			else
				return false;
		} else
			return false;
	}

	public static void main(String[] args) {
		try {

			String expression1 = "{{[[(())]]}}";
			System.out.println((isBalanced(expression1)) ? "YES" : "NO"); // YES PASS
			System.out.println();
			String expression2 = "{[(])}";
			System.out.println((isBalanced(expression2)) ? "YES" : "NO"); // NO PASS
			System.out.println();
			String expression3 = "[()][{}]{[({})[]]}";
			System.out.println((isBalanced(expression3)) ? "YES" : "NO"); // YES PASS
			System.out.println();
			String expression4 = "[](){}";
			System.out.println((isBalanced(expression4)) ? "YES" : "NO"); // YES PASS
			System.out.println();
			String expression5 = "({}{[]})({)}";
			System.out.println((isBalanced(expression5)) ? "YES" : "NO"); // NO PASS
			System.out.println();
			String expression6 = "((){)}";
			System.out.println((isBalanced(expression6)) ? "YES" : "NO"); // NO PASS

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
