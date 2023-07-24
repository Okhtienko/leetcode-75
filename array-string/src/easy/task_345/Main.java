package easy.task_345;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		final String word = "";
		System.out.println(reverseVowels(word));
	}

	public static String reverseVowels(final String word) {
		char[] array = word.toCharArray();
		final Stack<Character> stack = createStackOfVowels(array);
		for (int i = 0; i < array.length; i++) {
			if (isVowel(array[i])) {
				array[i] = stack.peek();
				stack.pop();
			}
		}
		return String.valueOf(array);
	}

	public static Stack<Character> createStackOfVowels(final char[] array) {
		Stack<Character> stack = new Stack<>();
		for (char value : array) {
			if (isVowel(value)) {
				stack.push(value);
			}
		}
		return stack;
	}

	public static boolean isVowel(final char value) {
		final Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		return set.contains(value);
	}
}
