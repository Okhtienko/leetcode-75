package easy.task_283;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{0, 0, 2, 1, 0};
		moveZeroes(numbers);
		display(numbers);
	}

	public static void moveZeroes(final int[] numbers) {
		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				swap(k++, i, numbers);
			}
		}
	}

	private static void swap(final int src, final int dst, final int[] numbers) {
		int buf = numbers[src];
		numbers[src] = numbers[dst];
		numbers[dst] = buf;
	}

	public static void display(final int[] numbers) {
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
	}
}
