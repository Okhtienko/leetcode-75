package easy.task_392;

public class Main {
	public static void main(String[] args) {
		final String subsequence = "b";
		final String text = "abc";
		System.out.println(isSubsequence(subsequence, text));
	}
	public static boolean isSubsequence(final String subsequence, final String text) {
		if (subsequence.isEmpty()) {
			return true;
		}

		StringBuilder str = new StringBuilder();
		int pointer = 0;

		for (int i = 0; i < text.length(); i++) {
			if (subsequence.charAt(pointer) == text.charAt(i)) {
				str.append(text.charAt(i));
				pointer++;
			}
			if (pointer >= subsequence.length()) {
				break;
			}
		}
		return str.toString().equals(subsequence) ? true : false;
	}
}
