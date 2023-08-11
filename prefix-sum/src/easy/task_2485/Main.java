package easy.task_2485;

public class Main {
	public static void main(String[] args) {
		final int number = 8;
		System.out.println(pivotInteger(number));
	}

	public static int pivotInteger(final int number) {
		int leftSum = 0;
		int rightSum = number * (number + 1) / 2;

		for (int i = 1; i <= number; i++) {
			leftSum += i;
			rightSum -= i - 1;
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}
}
