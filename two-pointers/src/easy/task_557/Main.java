package easy.task_557;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		final String text = "Let's take LeetCode contest";
		System.out.println(reverseWords(text));
	}

	public static String reverseWords(final String text) {
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			words[i] = reverseWord(words[i]);
		}
		return Arrays.stream(words).collect(Collectors.joining(" "));
	}

	public static String reverseWord(final String word) {
		StringBuilder stringBuilder = new StringBuilder(word);
		return stringBuilder.reverse().toString();
	}
}
