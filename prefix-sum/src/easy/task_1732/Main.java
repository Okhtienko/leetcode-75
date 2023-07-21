package easy.task_1732;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final int[] gain = new int[]{-4, -3, -2, -1, 4, 3, 2};
		System.out.println(largestAltitude(gain));
	}

	public static int largestAltitude(final int[] gain) {
		int[] heights= new int[gain.length + 1];
		for (int i = 1; i < heights.length; i++) {
			heights[i] = heights[i - 1] + gain[i - 1];
		}
		return Arrays.stream(heights).max().getAsInt();
	}
}
