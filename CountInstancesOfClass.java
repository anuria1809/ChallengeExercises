package self.practise;

public class CountInstancesOfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyClass();
		new MyClass();
		new MyClass();
		System.out.println(MyClass.getNumOfInstances());
	}

}

class MyClass {

	private static int counter;

	public MyClass() {
		// ...
		counter++;
	}

	public static int getNumOfInstances() {
		return counter;
	}
}