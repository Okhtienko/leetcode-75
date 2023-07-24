package easy.task_1207;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		final int[] array = new int[]{1, 2, 2, 1, 1, 3};
		System.out.println(uniqueOccurrences(array));
	}

	public static boolean uniqueOccurrences(final int[] array) {
		Map<Integer, Integer> map = createMap(array);
		Set<Integer> set = new HashSet<>(map.values());
    return set.size() == map.size() ? true : false;
	}

	public static Map<Integer, Integer> createMap(final int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int value : array) {
			map.put(value, map.getOrDefault(value, 0) + 1);
		}
		return map;
	}
}
