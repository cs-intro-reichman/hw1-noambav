// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);

		int hunderds = num / 100;
		int tens = num % 100 / 10;
		int ones = num % 10;

		System.out.println(hunderds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
