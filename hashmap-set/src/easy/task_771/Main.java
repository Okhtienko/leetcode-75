package easy.task_771;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		final String jewels = "aA";
		final String stones = "aAAbbbb";
		System.out.print(numJewelsInStones(jewels, stones));
	}

	public static int numJewelsInStones(final String jewels, final String stones) {
		int count = 0;
		Map<Character, Integer> map = createMap(stones);
		for(int i = 0; i < jewels.length(); i++) {
			if (map.containsKey(jewels.charAt(i))) {
				count += map.get(jewels.charAt(i));
			}
		}
		return count;
	}

	public static Map<Character, Integer> createMap(final String stones) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < stones.length(); i++) {
			map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
		}
		return map;
	}
}
