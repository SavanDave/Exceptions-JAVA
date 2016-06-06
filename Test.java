import java.util.Random;

public class Test {

	public static void main(String[] args) throws Exception {

		Random r = new Random();
		int arraySize= r.nextInt();
		int[] grades = new int[arraySize];

		for (int i = 0; i < grades.length; i++) {
			grades[i] = r.nextInt();
		}

		try {
			average(grades);
		} catch (InvalidGradeException e) {
			e.toString();
		}
		System.out.println(average(grades));
	}

	private static int average(int[] arrayOfNums) throws Exception {
		int result, sum = 0;
		for (int number : arrayOfNums) {
			int index = 0;
			if (number >= 0 && number <= 100)
				sum += number;
			else
				throw new InvalidGradeException(arrayOfNums[index], index);
		}
		result = sum / arrayOfNums.length;

		return result;
	}

}
