package self.practise;

/* This only adds & removes the elements from an arraylist */
class ArrayList {
	private static int maxsize;
	private static Object data[];
	private static int index;

	public ArrayList() {
		maxsize = 5;
		data = new Object[5];
		index = -1;
	}

	public void add(Object obj) {
		int totalelts = index + 1;

		// 1. if size is exceeding then increase the size (call reallocate
		// method)
		// 2. increment the index
		// 3. add the current element
		if (totalelts == maxsize) {
			reallocate();
		}
		index++;
		data[index] = obj;
	}

	public void reallocate() {
		// 1. Store the value of maxsize in another variable (oldsize)
		// 2. increment the value of maxsize by 5
		// 3. Allocate a new array of objects of maxsize (newdata)
		// 4. Copy the contents of data array into newdata
		// 5. Finally assign the reference of newdata to data
		int oldsize = maxsize;

		maxsize = maxsize + 5;

		Object newdata[] = new Object[maxsize];
		for (int i = 0; i < oldsize; i++) {
			newdata[i] = data[i];
		}
		data = newdata;
	}

	public void remove(int pos) {

		// 1. Check whether the position exists in the array or not
		// 1-->1. if pos > index then deletion not possible
		// 1-->2. if pos < index then deletion is possible
		// 2. To delete the element at that pos start a loop from that position
		// & shift all the elements at right
		// to the left
		// 2-->1.Finally decrement the value of index after iteration stops

		if (pos > index || pos < 0) {
			System.out.println(" \nDeletion not posssible ");
			System.exit(0);
		}

		else {

			System.out.println();

			System.out.println(" elt at " + pos + " is " + data[pos]);

			for (int i = pos; i <= index; i++) {
				data[i] = data[i + 1];
			}
			index--;
		}
	}

	public static void disp() {
		int totalelts = index + 1;

		System.out.println();
		System.out.println();

		System.out.println(" The total number of elements are " + totalelts);

		System.out.println();

		System.out.println(" The size allowed is " + maxsize);

		System.out.println();

		System.out.println(" The contents of the ArrayList are ");

		for (int i = 0; i < totalelts; i++) {
			System.out.println();
			System.out.print(data[i]);
		}
	}
}

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arrlist = new ArrayList();

		String s1 = new String("a"); // index 0
		String s2 = new String("b"); // index 1
		String s3 = new String("c"); // index 2
		String s4 = new String("d"); // index 3
		String s5 = new String("e"); // index 4
		String s6 = new String("f"); // index 5
		String s7 = new String("g"); // index 6
		String s8 = new String("h"); // index 7
		String s9 = new String("i"); // index 8
		String s10 = new String("j"); // index 9
		String s11 = new String("k"); // index 10
		String s12 = new String("l"); // index 11
		String s13 = new String("m"); // index 12
		String s14 = new String("n"); // index 13
		String s15 = new String("o"); // index 14
		String s16 = new String("p"); // index 15
		System.out.println(" Elements before deletion are ");

		arrlist.add(s1);
		arrlist.add(s2);
		arrlist.add(s3);
		arrlist.add(s4);
		arrlist.add(s5);
		arrlist.add(s6);
		arrlist.add(s7);
		arrlist.add(s8);
		arrlist.add(s9);
		arrlist.add(s10);
		arrlist.add(s11);
		arrlist.add(s12);
		arrlist.add(s13);
		arrlist.add(s14);
		arrlist.add(s15);
		arrlist.add(s16);

		ArrayList.disp();

		arrlist.remove(2);

		ArrayList.disp();

		arrlist.remove(3);

		ArrayList.disp();

		arrlist.remove(4);

		ArrayList.disp();

		arrlist.remove(-1);

		ArrayList.disp();
	}
}