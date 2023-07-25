package medium.task_1679;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{2, 2, 2, 3, 1, 1, 4, 1};
		final int k = 6;
		System.out.println(maxOperations(numbers, k));
	}

	public static int maxOperations(final int[] numbers, final int k) {
		int left = 0;
		int right = numbers.length - 1;
		int countOperations = 0;
		Arrays.sort(numbers);

		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				countOperations++;
				right--;
				left++;
			} else if (sum < k) {
				left++;
			} else {
				right--;
			}
		}

		return countOperations;
	}
}
