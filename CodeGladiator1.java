import java.util.Scanner;

/**
 * 
 * @author anuri
 * 
 *         Description: Code Gladiators 2021 Test 1 check if blood group string
 *         is subsequence of virus string
 *
 */

public class CodeGladiator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String virus = sc.nextLine();
		int numberOfPeople = sc.nextInt();
		if (virus.length() >= 1 && virus.length() <= 100000 && numberOfPeople >= 1 && numberOfPeople <= 10) {
			while (sc.hasNext()) {
				String bloodComp = sc.nextLine();
				boolean isPositive = false;
				if (bloodComp.length() >= 1 && bloodComp.length() <= 100000) {
					char[] bloodChars = bloodComp.toCharArray();
					int fromIndex = 0;
					for (int j = 0; j < bloodChars.length; j++) {
						fromIndex = virus.indexOf(bloodChars[j], fromIndex);
						if (fromIndex != -1 && j == bloodChars.length - 1) {
							isPositive = true;
							break;
						} else if (fromIndex != -1 && j < bloodChars.length) {
							continue;
						} else {
							break;
						}
					}
					if (isPositive)
						System.out.println("POSITIVE");
					else
						System.out.println("NEGATIVE");
				}
			}
		}
		sc.close();
	}

}
