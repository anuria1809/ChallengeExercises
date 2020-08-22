package self.practise;

/**
 * 
 * @author asdd
 *
 * word formed by rearranging the letters of another word
 */
public class AnagramsTest {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		boolean result = true;
		if (a.length() > 0 && a.length() <= 50 && b.length() > 0 && b.length() <= 50 && a.length() == b.length()) {

			char[] aCharArray = a.toLowerCase().toCharArray();;
			char[] bCharArray = b.toLowerCase().toCharArray();			
			for(int i=0; i<aCharArray.length; i++) {
				for(int j=0; j<aCharArray.length; j++) {
					if(aCharArray[i]<aCharArray[j]) {
						char temp = aCharArray[i];
						aCharArray[i] = aCharArray[j];
						aCharArray[j] = temp;
					}
					if(bCharArray[i]<bCharArray[j]) { 
						char temp = bCharArray[i];
						bCharArray[i] = bCharArray[j];
						bCharArray[j] = temp;
					}
				}
			}
			for(int i=0; i<aCharArray.length; i++) {
				if(aCharArray[i] != bCharArray[i])
					result = false;
			}
		}
		else
			result = false;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("EhoLl", "HELLO"));
	}

}
