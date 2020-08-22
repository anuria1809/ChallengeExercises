package self.practise;

/**
 * reverse the order of occurrence of words in a string without using any library except toCharArray()
 *
 */
public class ReverseWordOrderInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String textToBeReversed = "I am in Pune today";
		String expected = "today Pune in am I";
		System.out.println(reversedString(textToBeReversed).trim());
	}

	public static String reversedString(String text) {
		String rev = "";
		char[] textCharArray = text.toCharArray();
		System.out.print("char array: ");
		System.out.println(textCharArray);
		int noOfWordsInText = 0;
		for(int i=0; i<text.length();i++) {
			if(textCharArray[i] == ' ') {
				noOfWordsInText++;
			}
		}
		noOfWordsInText++;
		System.out.println("no of words: "+noOfWordsInText);
		int spacePos = -1;
		String[] wordArray = new String[noOfWordsInText];
		for(int x=0; x<noOfWordsInText; x++) {
			// for first word
			if(spacePos<0) {
				spacePos = text.indexOf(' ');
				wordArray[x] = text.substring(0, spacePos);
			}
			// for rest of the words
			else if(spacePos>0 && x<noOfWordsInText-1) {
				text = text.substring(spacePos+1,text.length());
				spacePos = text.indexOf(' ');
				wordArray[x] = text.substring(0, spacePos);
			}
			else if(x==noOfWordsInText-1) {
				text = text.substring(spacePos+1);
				wordArray[x] = text;
			}
		}
		System.out.print("word array: ");
		for(String word:wordArray)
			System.out.print(word+",");
		System.out.println();
		for(int y=wordArray.length-1;y>=0;y--) {
				rev = rev + " " + wordArray[y];
		}
		return rev;
	}
}
