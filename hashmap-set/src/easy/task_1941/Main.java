package easy.task_1941;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		final String str = "abacbc";
		System.out.println(areOccurrencesEqual(str));
	}

	public static boolean areOccurrencesEqual(final String str) {
		final Map<Character, Integer> map = createMap(str);
		Set<Integer> set = new HashSet<>(map.values());
		return set.size() == 1;
	}

	public static Map<Character, Integer> createMap(final String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();
		for (char symbol : chars) {
			map.put(symbol, map.getOrDefault(symbol, 0) + 1);
		}
		return map;
	}
}
