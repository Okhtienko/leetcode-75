package easy.task_2465;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{9, 5, 7, 8, 7, 9, 8, 2, 0, 7};
		System.out.println(distinctAverages(numbers));
	}

	public static int distinctAverages(final int[] numbers) {
		Set<Double> set = new HashSet<>();
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			double averageValue = (double) (numbers[left++] + numbers[right--]) / 2;
			set.add(averageValue);
		}
		return set.size();
	}
}
