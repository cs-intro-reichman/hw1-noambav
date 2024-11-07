// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double interstRate = Double.parseDouble(args[1]);
		double percentageRate = interstRate / 100;
		int years = Integer.parseInt(args[2]);

		int futureValue = (int) (currentValue * Math.pow((1 + percentageRate), years));

		System.out.println("After " + years + " years, a $" + currentValue + " saved at " + (double) interstRate
				+ "% will yield $" + futureValue);

	}
}