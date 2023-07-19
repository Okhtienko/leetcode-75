package easy.task_724;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(numbers));
	}

	public static int pivotIndex(final int[] numbers) {
		int sum = 0;
		int leftSum = 0;

		for (int number : numbers) {
			sum += number;
		}

		for (int i = 0; i < numbers.length; i++) {
			if (leftSum == sum - leftSum - numbers[i]) {
				return i;
			}
			leftSum += numbers[i];
		}

		return -1;
	}
}
