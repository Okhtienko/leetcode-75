package task_104;

public class Main {
	public static void main(String[] args) {
		final TreeNode root = new TreeNode(3,
					new TreeNode(9),
					new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		System.out.println(maxDepth(root));
	}

	public static int maxDepth(final TreeNode root) {
	  if (root == null) {
			return 0;
	  }
		int left = maxDepth(root.getLeft());
		int right = maxDepth(root.getRight());
		return Math.max(left, right) + 1;
	}
}
