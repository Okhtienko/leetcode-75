package easy.task_2108;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final String[] words = new String[]{"abc","car","ada","racecar","cool"};
		System.out.println(firstPalindrome(words));
	}

	public static String firstPalindrome(final String[] words) {
		return Arrays.stream(words).filter(word -> word.equals(reverseWord(word))).findFirst().orElse("");
	}

	public static String reverseWord(final String word) {
		StringBuilder reverse = new StringBuilder(word);
		return reverse.reverse().toString();
	}
}
