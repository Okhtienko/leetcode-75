package easy.task_832;

public class Main {
	public static void main(String[] args) {
		final int[][] image = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
		display(flipAndInvertImage(image));
	}
	
	public static int[][] flipAndInvertImage(final int[][] image) {
		for (int i = 0; i < image.length; i++) {
			reverseArray(image[i]);
			for (int j = 0; j < image[i].length; j++) {
				image[i][j] = (image[i][j] == 0) ? 1 : 0;
			}
		}
		return image;
	}

	public static void reverseArray(final int[] row) {
		for (int i = 0; i < row.length / 2; i++) {
			swap(row, i, row.length - i - 1);
		}
	}

	public static void swap(final int[] row, final int left, final int right) {
		int temp = row[left];
		row[left] = row[right];
		row[right] = temp;
	}

	public static void display(final int[][] image) {
		for (int[] rows : image) {
			for (int columns : rows) {
				System.out.print(columns + " ");
			}
			System.out.println();
		}
	}
}
