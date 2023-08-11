package easy.task_682;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		final String[] ops = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
		System.out.println(calPoints(ops));
	}

	public static int calPoints(final String[] operations) {
		final Stack<Integer> stack = createStack(operations);
		int sum = 0;
		for (int value : stack) {
			sum += value;
		}
		return sum;
	}

	public static Stack<Integer> createStack(final String[] operations)  {
		Stack<Integer> stack = new Stack<>();
		for (String operation : operations) {
			if (operation.equals("C")) {
				stack.pop();
			} else if (operation.equals("D")) {
				stack.push(stack.peek() * 2);
			} else if (operation.equals("+")) {
				int number = stack.pop();
				int sum = stack.peek() + number;
				stack.push(number);
				stack.push(sum);
			} else {
				stack.push(Integer.parseInt(operation));
			}
		}
		return stack;
	}
}
