package medium.task_2352;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		final int[][] grid = new int[][]{{13, 13},{13, 13}};
		System.out.println(equalPairs(grid));
	}

	public static int equalPairs(final int[][] grid) {
		int count = 0;
		final Map<List<Integer>, Integer> rows = createMapOfRows(grid);
		final Map<List<Integer>, Integer> columns = createMapOfСolumns(grid);

		for (Map.Entry<List<Integer>, Integer> entry : rows.entrySet()) {
			if (columns.containsKey(entry.getKey())) {
				count += entry.getValue() * columns.get(entry.getKey());
			}
		}
		return count;
	}

	public static Map<List<Integer>, Integer> createMapOfRows(final int[][] grid) {
		Map<List<Integer>, Integer> rows = new HashMap<>();
		for (int i = 0; i < grid.length; i++) {
			List<Integer> row = Arrays.stream(grid[i]).boxed().toList();
			rows.put(row, rows.getOrDefault(row, 0) + 1);
		}
		return rows;
	}

	public static Map<List<Integer>, Integer> createMapOfСolumns(final int[][] grid) {
		Map<List<Integer>, Integer> columns = new HashMap<>();
		for (int i = 0; i < grid.length; i++) {
			int[] array = new int[grid[0].length];
			for (int j = 0; j < grid[0].length; j++) {
				array[j] = grid[j][i];
			}
			List<Integer> column = Arrays.stream(array).boxed().toList();
			columns.put(column, columns.getOrDefault(column, 0) + 1);
		}
		return columns;
	}
}
