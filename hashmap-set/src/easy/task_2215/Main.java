package easy.task_2215;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		final int[] first = new int[]{1, 2, 3};
		final int[] second = new int[]{2, 4, 6};
		display(findDifference(first, second));
	}

	public static List<List<Integer>> findDifference(final int[] first, final int[] second) {
		List<List<Integer>> list = new ArrayList<>();
		Set<Integer> firstSet = createSet(first);
		Set<Integer> secondSet = createSet(second);
		List<Integer> firstAnswer = new ArrayList<>();
		List<Integer> secondAnswer = new ArrayList<>();

		for(int number : firstSet) {
			if (!secondSet.contains(number)) {
				firstAnswer.add(number);
			}
		}

		for(int number : secondSet) {
			if (!firstSet.contains(number)) {
				secondAnswer.add(number);
			}
		}

		list.add(firstAnswer);
		list.add(secondAnswer);

		return list;
	}

	public static Set<Integer> createSet(final int[] numbers) {
		return Arrays.stream(numbers).boxed().collect(Collectors.toSet());
	}

	public static void display(final List<List<Integer>> list) {
		list.forEach(innerList -> {
			innerList.forEach(number -> System.out.print(number + " "));
			System.out.println();
		});
	}
}
