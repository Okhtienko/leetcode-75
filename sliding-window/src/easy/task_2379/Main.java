package easy.task_2379;

public class Main {
	public static void main(String[] args) {
		final String blocks = "WBBWWBBWBW";
		final int k = 7;
		System.out.println(minimumRecolors(blocks, k));
	}

	public static int minimumRecolors(final String blocks, final int k) {
		int lenRecolors = 0;
		int numberOfOperations = 0;
		int min = Integer.MAX_VALUE;
		int left = 0;
		for (int right = 0; right < blocks.length(); right++) {
			if (blocks.charAt(right) == 'W') {
				numberOfOperations++;
			}
			lenRecolors++;
			if (lenRecolors == k) {
				min = Math.min(min, numberOfOperations);
				if (blocks.charAt(left) == 'W') {
					numberOfOperations--;
				}
				lenRecolors--;
				left++;
			}
		}
		return min;
	}
}
