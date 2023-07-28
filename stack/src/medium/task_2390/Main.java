package medium.task_2390;

import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		final String str = "leet**cod*e";
		System.out.println(removeStars(str));
	}

	public static String removeStars(final String str) {
		Stack<Character> stack = createStack(str);
		return stack.stream().map(value -> value.toString()).collect(Collectors.joining());
	}

	public static Stack<Character> createStack(final String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '*') {
				stack.push(str.charAt(i));
			} else {
				stack.pop();
			}
		}
		return stack;
	}
}
