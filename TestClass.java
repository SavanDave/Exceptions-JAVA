import java.util.Random;

public class TestClass {

	public static void main(String[] args) {
		try {
			drinkMilk();
		} catch (OutOfMilkException ome) {
			long timePassed = ome.getTimeOfException() - ome.getStart();
			System.out.println(ome.toString() + ". The time it took to drink the milk was:" + timePassed);
		}
	}

	static void drinkMilk() throws OutOfMilkException {
		long start = System.currentTimeMillis();
		Random r = new Random();

		while (true) {
			try {
				int quotient = 10 / r.nextInt(1000);
				System.out.print("Gulp");
			} catch (ArithmeticException aE) {
				throw new OutOfMilkException(start);
			}

		}
	}
}