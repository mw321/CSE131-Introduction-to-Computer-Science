package lab7;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val, TreeNode left, TreeNode right){
    		this.val = val;
    		this.left = left;
    		this.right = right;
    }
    public List<Integer> printPath(TreeNode root, int key){
		List<Integer> result = new ArrayList<>();
		if (root != null) {
			findPath(root, key, new ArrayList<>(), result);
		}
		return result;
	}
	public List<Integer> findPath(TreeNode root, int key, List<Integer> path, List<Integer> result){
		if (root == null) {
			return result;
		}
		if (root != null) {
			path.add(root.val);
		}
		if (root.val == key) {
			result.addAll(path);
			return result;
		}
		findPath(root.left, key, new ArrayList<>(path), result);
		findPath(root.right, key, new ArrayList<>(path), result);
		return result;
	}
}
