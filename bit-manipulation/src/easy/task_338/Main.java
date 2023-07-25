package easy.task_338;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final int number = 5;
		display(countBits(number));
	}

	public static int[] countBits(final int number) {
		int[] bits = new int[number + 1];
		for (int i = 0; i < bits.length; i++) {
			String binary = Integer.toBinaryString(i);
			bits[i] = countUnits(binary);
		}
		return bits;
	}

	public static int countUnits(final String number) {
		int count = 0;
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

	public static void display(final int[] bits) {
		Arrays.stream(bits).forEach(bit -> System.out.print(bit + " "));
	}
}
