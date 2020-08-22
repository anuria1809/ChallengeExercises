package self.practise;

/**
 * genarate random integer b/w two integers
 * @author asdd
 *
 */
public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(randomGenerator(10, 20));
	}

	public static Integer randomGenerator(int num1, int num2) {
		return Integer.valueOf((int) (num1 + Math.random()*(num2-num1)));
	}
}
