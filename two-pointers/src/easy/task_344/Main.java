package easy.task_344;

public class Main {
	public static void main(String[] args) {
		final char[] chars = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
		reverseString(chars);
	}

	public static void reverseString(final char[] chars) {
		int right = chars.length - 1;
		int left = 0;
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
	}
}
