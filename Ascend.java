// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * limit);
		int b = (int) (Math.random() * limit);
		int c = (int) (Math.random() * limit);

		System.out.println(a + " " + b + " " + c);

		int tempA = a;
		int tempB = b;
		int tempC = c;

		a = Math.min(a, b);
		b = Math.max(tempA, tempB);

		c = Math.max(b, c);
		b = Math.min(b, tempC);

		tempA = a;
		a = Math.min(a, b);
		b = Math.max(tempA, b);

		System.out.println(a + " " + b + " " + c);

	}
}
