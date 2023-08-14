package easy.task_350;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		final int[] firstNumbers = new int[]{1, 2, 2, 1};
		final int[] secondNumbers = new int[]{2};
		display(intersect(firstNumbers, secondNumbers));
	}

	public static int[] intersect(final int[] firstNumbers, final int[] secondNumbers) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int number : secondNumbers) {
			map.put(number, map.getOrDefault(number, 0) + 1);
		}

		for (int number : firstNumbers) {
			if (map.containsKey(number) && map.get(number) != 0) {
				list.add(number);
				map.put(number, map.get(number) - 1);
			}
		}

		return  list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void display(final int[] numbers) {
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
	}
}
