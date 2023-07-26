package easy.task_643;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{1, 12, -5, -6, 50, 3};
		final int k = 4;
		System.out.println(findMaxAverage(numbers, k));
	}

	public static double findMaxAverage(final int[] numbers, final int k) {
		double totalSum = findSumOfNumbers(numbers, k);
		double maxSum = totalSum;
		for (int i = 0; i < numbers.length - k; i++) {
			totalSum -= numbers[i];
			totalSum += numbers[i + k];
			maxSum = Math.max(totalSum, maxSum);
		}
		return maxSum/k;
	}

	public static double findSumOfNumbers(final int[] numbers, final int k) {
		return Arrays.stream(numbers).limit(k).sum();
	}
}
