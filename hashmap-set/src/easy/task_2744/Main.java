package easy.task_2744;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		final String[] words = new String[]{"cd", "ac", "dc", "ca", "zz"};
		System.out.println(maximumNumberOfStringPairs(words));
	}

	public static int maximumNumberOfStringPairs(final String[] words) {
		Set<String> set = new HashSet<>();
		for (String word : words) {
			if (!set.contains(reverseWord(word))) {
				set.add(word);
			}
		}
		return words.length - set.size();
	}

	public static String reverseWord(final String word) {
		StringBuilder stringBuilder = new StringBuilder(word);
		return stringBuilder.reverse().toString();
	}
}
