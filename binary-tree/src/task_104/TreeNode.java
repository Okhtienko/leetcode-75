package task_104;

public class TreeNode {
	private int value;
  private TreeNode left;
  private TreeNode right;

	public TreeNode(int value) {
		this.value = value;
	}

	public TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public TreeNode getLeft() {
		return left;
	}

	public TreeNode getRight() {
		return right;
	}
}
