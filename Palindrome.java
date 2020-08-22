package self.practise;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        String reverse = new String();
        for(int i=A.length()-1; i>=0; i--) {
        	String letter = ""+A.charAt(i);
        	reverse = reverse.concat(letter);
        }
        if(A.equals(reverse))
        	System.out.println("Yes");
        else
        	System.out.println("No");
        
    }
}
