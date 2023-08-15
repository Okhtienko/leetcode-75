package easy.task_27;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{3, 2, 2, 3};
		final int value = 3;
		removeElement(numbers, value);
		display(numbers);
	}

	public static int removeElement(final int[] numbers, final int value) {
		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != value) {
				numbers[k] = numbers[i] ;
				k++;
			}
		}
		return k;
	}

	public static void display(final int[] array) {
		Arrays.stream(array).forEach(number -> System.out.print(number + " "));
	}
}
