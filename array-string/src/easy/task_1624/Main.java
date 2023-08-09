package easy.task_1624;

public class Main {
	public static void main(String[] args) {
		final String str = "abca";
		System.out.println(maxLengthBetweenEqualCharacters(str));
	}

	public static int maxLengthBetweenEqualCharacters(final String str) {
		int lengthSubstring = -1;
		for (int i = 0; i < str.length(); i++) {
			int index = str.lastIndexOf(str.charAt(i));
			if (index != i) {
				lengthSubstring = Math.max(lengthSubstring, index - i - 1);
			}
		}
		return lengthSubstring;
	}
}
