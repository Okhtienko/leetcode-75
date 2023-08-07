package medium.task_1004;

public class Main {
	public static void main(String[] args) {
		final int[] numbers = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		final int k = 2;
		System.out.println(longestOnes(numbers, k));
	}

	public static int longestOnes(final int[] numbers, final int k) {
		int count = 0;
		int zero = 0;
		int left = 0;
		for (int right = 0; right < numbers.length; right++) {
			if (numbers[right] == 0) {
				zero++;
			}
			if (zero > k) {
				if (numbers[left] == 0) {
					zero--;
				}
				left++;
			}
			count = Math.max(count, right - left + 1);
		}
		return count;
	}
}
