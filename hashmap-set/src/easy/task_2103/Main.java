package easy.task_2103;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		final String rings = "B0B6G0R6R0R6G9";
		System.out.println(countPoints(rings));
	}

	public static int countPoints(final String rings) {
		int count = 0;
		Map<Character, Set> map = createMap(rings);
		for (Map.Entry<Character, Set> entry : map.entrySet()) {
			if(entry.getValue().size() == 3) {
				count++;
			}
		}
		return count;
	}

	public static Map<Character, Set> createMap(final String rings) {
		Map<Character, Set> map = new HashMap<>();
		for (int i = 0; i < rings.length(); i += 2) {
			if (map.containsKey(rings.charAt(i+1))) {
				map.get(rings.charAt(i+1)).add(rings.charAt(i));
			} else {
				Set<Character> set = new HashSet<>();
				set.add(rings.charAt(i));
				map.put(rings.charAt(i+1), set);
			}
		}
		return map;
	}
}
