package medium.task_1343;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
		final int k = 3;
		final int threshold = 5;
		System.out.println(numOfSubarrays(numbers, k, threshold));
	}

	public static int numOfSubarrays(final int[] numbers, final int k, final int threshold) {
		int sum = findSumOfNumbers(numbers, k);
		int count = (sum / k >= threshold) ? 1 : 0;
		for(int i = 0; i < numbers.length - k; i++) {
			sum -= numbers[i];
			sum += numbers[i + k];
			count += (sum / k >= threshold) ? 1 : 0;
		}
		return count;
	}

	public static int findSumOfNumbers(final int[] numbers, final int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}
