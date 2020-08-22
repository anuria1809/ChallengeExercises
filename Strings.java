package self.practise;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		String s5 = s1;
		String s6 = s2;
		String s7 = s3;
		String s8 = s4;
		System.out.println("== compares object");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s5==s6);
		System.out.println(s7==s8);
		System.out.println("equals compares content");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s6));
		System.out.println(s5.equals(s6));
		System.out.println(s7.equals(s8));
	}

}
