package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class LeetCode implements Sta<String>{

	public int maxAreaOfIsland(int[][]grid) {
		boolean[][]seen = new boolean[grid.length][grid[0].length];
		int ans = 0;
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[0].length; c++) {
				ans = Math.max(ans, area(r, c, grid, seen));
			}
		}
		return ans;
	}
	public int area(int r, int c, int[][]grid, boolean[][]seen) {
		if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || seen[r][c] || grid[r][c] == 0) {
			return 0;
		}
		seen[r][c] = true;
		return (1 + area(r, c-1, grid, seen) + area(r, c+1, grid, seen) + area(r-1, c, grid, seen) + area(r+1, c, grid, seen));
	}
	
	public int getImportance(List<Employee> employees, int id){
		Map<Integer, Employee> map = new HashMap<>();
		for (Employee e : employees) map.put(e.id, e);
		return dfs(id, map);
	}
	public int dfs(int id, Map<Integer, Employee> map){
		Employee e = map.get(id);
		int ans = e.importance;
		for (Integer subid : e.subordinates){
			ans += dfs(subid, map);
		}
		return ans;
	}

	public static String minWindow(String s, String t) {
		int[]expected = new int[256];
		int[]visited = new int[256];
		for (int i = 0; i < t.length(); i++) {
			expected[(int) t.charAt(i)]++;
		}
		int end = 0, minLength = Integer.MAX_VALUE, count = 0;
		String result = "";
		for (int start = 0; start < s.length(); start++) {
			while (end < s.length() && count != t.length()) {
				visited[(int) s.charAt(end)]++;
				if (visited[(int) s.charAt(end)] <= expected[s.charAt(end)]) {
					count++;
				}
				end++;
			}
			if (count == t.length()) {
				if (end - start < minLength) {
					minLength = end - start;
					result = s.substring(start, end);
				}
			}
			if (expected[s.charAt(start)] > 0) {
				visited[s.charAt(start)]--;
				if (visited[s.charAt(start)] < expected[s.charAt(start)]) {
					count--;
				}
			}
		}
		return result;
	}

	public void flatten(TreeNode root) {
		if (root != null) flattenHelper(root);
	}
	public TreeNode flattenHelper(TreeNode root) {
		if (root.left == null && root.right == null) {
			return root;
		}
		if (root.left == null && root.right != null) {
			return flattenHelper(root.right);
		}
		if (root.left != null && root.right == null) {
			root.right = root.left;
			root.left = null;
			return flattenHelper(root.right);
		}
		TreeNode rightChild = root.right;
		TreeNode temp = flattenHelper(root.left);
		root.right = root.left;
		root.left = null;
		//extra thoughts
		while (temp.right != null) {
			temp = temp.right;
		}
		temp.right = rightChild;
		return flattenHelper(rightChild);
	}

	public List<Integer> BFSrightSideView(TreeNode root){
		List<Integer> result = new ArrayList<>();
		if (root == null) return result;
		//BFS traversal
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		//traverse the tree level by level
		while (!queue.isEmpty()) {
			Queue<TreeNode> q2 = new LinkedList<>();
			while (!queue.isEmpty()) {
				TreeNode top = queue.poll();
				if (queue.isEmpty()) {
					result.add(top.val);
				}
				if (top.left != null) {
					q2.offer(top.left);
				}
				if (top.right != null) {
					q2.offer(top.right);
				}
			}
			queue = q2;
		}
		return result;
	}
	public List<Integer> DFSrightSideView(TreeNode root){
		List<Integer> result = new ArrayList<>();
		if (root == null) return result;
		int[] maxDepth = {0};
		rightSideView(result, root, 1, maxDepth);
		return result;
	}
	public void rightSideView(List<Integer>result, TreeNode root, int depth, int[] maxDepth) {
		if (depth > maxDepth[0]) {
			maxDepth[0] = depth;
			result.add(root.val);
		}
		if (root.right != null) rightSideView(result, root.right, depth++, maxDepth);
		if (root.left != null) rightSideView(result, root.left, depth++, maxDepth);
	}
	public List<Integer> DFSrightSideView2(TreeNode root){
		List<Integer> result = new ArrayList<>();
		if  (root == null) return result;
		int maxDepth = 0;
		rightSideView2(result, root, 1, maxDepth);
		return result;
	}
	public void rightSideView2(List<Integer> result, TreeNode root, int depth, int maxDepth) {
		if (depth > maxDepth) {
			maxDepth = depth;
			result.add(root.val);
		}
		if (root.right != null) rightSideView2(result, root.right, depth++, maxDepth);
		if (root.left != null) rightSideView2(result, root.left, depth++, maxDepth);
	}
	public List<Integer> DFSrightSideView3(TreeNode root){
		List<Integer> result = new ArrayList<>();
		if (root == null) return result;
		rightSideView3(result, root, 0);
		return result;
	}
	public void rightSideView3(List<Integer> result, TreeNode root, int level) {
		if (level == result.size()) result.add(root.val);
		if (root.right != null) rightSideView3(result, root.right, level+1);
		if (root.left != null) rightSideView3(result, root.left, level+1);
	}

	private List<String> list;
	public LeetCode() {
	}
	@Override
	public void push(String s) {
		list.add(s);
	}
	@Override
	public String pop() {
		return list.remove(list.size() - 1);
	}
	public String toString() {
		return list.toString();
	}


	public char mostFrequent(String str) {
		Map<Character, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 0);
			}
			int n = map.get(c);
			map.put(c, n++);
			if (map.get(c) > max) {
				max = map.get(c);
				index = i;
			}
		}
		return str.charAt(index);
	}
	public int kthSmall(int[] arr1, int[]arr2, int k) {
		int[] result = merge(arr1, arr2);
		return result[k - 1];
	}
	public int[] merge(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		int i = 0, i1 = 0, i2 = 0;
		while (i1 < arr1.length && i2 < arr2.length) {
			if (arr1[i1] < arr2[i2]) {
				arr[i++] = arr1[i1++];
			} else {
				arr[i++] = arr2[i2++];
			}
		}
		for (int index = i1; index < arr1.length; index++) {
			arr[i++] = arr1[index];
		}
		for (int index = i2; index < arr2.length; index++) {
			arr[i++] = arr2[index];
		}
		return arr;
	}
	public int stringCombinationNum(String number) {
		if (!number.isEmpty()) {
			return findCombination(number, 0, 0, 0);
		}
		return 0;
	}
	public int findCombination(String number, int start, int index, int count) {
		if (start == number.length() - 1) {
			if (isValid(number.substring(start, index))){
				return count;
			}
		}
		if (index == number.length() - 1) {
			if (isValid(number.substring(start, index))){
				count++;
			}
		}
		if (isValid(number.substring(start, index))) {
			findCombination(number, start + 1, index + 1, count);
			findCombination(number, start, index + 1, count);
		}
		return count;
	}
	public boolean isValid(String s) {
		int num = Integer.parseInt(s);
		return num > 0 && num <= 26 && !(s.charAt(0) == '0');
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) return null;
		Set<ListNode> set = new HashSet<>();
		ListNode dummyA = new ListNode(-1);
		dummyA.next = headA;
		ListNode cur = dummyA;
		while (cur.next != null) {
			set.add(cur.next);
			cur = cur.next;
		}
		ListNode dummyB = new ListNode(-1);
		dummyB.next = headB;
		ListNode pre = dummyB;
		while (pre.next != null) {
			if (set.contains(pre.next)){
				return pre.next;
			}
			pre = pre.next;
		}
		return null;
	}

	public static int[] threeSum(int[] nums, int target) {
		Arrays.sort(nums);
		int[] result = new int[3];
		if (nums.length < 3) {
			return nums;
		}
		for (int i = 0; i < nums.length - 1; i++) { //-1 or -2??
			int front = i + 1, back = nums.length - 1, newTarget = target - nums[i];
			while (front < back) {
				int sum = nums[front] + nums[back];
				if (sum == newTarget) {
					result[0] = nums[i];
					result[1] = nums[front];
					result[2] = nums[back];
					return result;
				}
				else if (sum > newTarget) {
					back--;
				}
				else {
					front++;
				}
			}
		}
		return result;
	}
	public static int[] twoSum(int[] nums, int target) {
		int []result = new int[2];
		Arrays.sort(nums);
		// two pointers
		int front = 0, back = nums.length - 1;
		while (front < back) {
			int sum = nums[front] + nums[back];
			if (sum == target) {
				result[0] = nums[front];
				result[1] = nums[back];
				return result;
			}
			else if (sum > target) {
				back--;
			}
			else {
				front++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		List<List<String>> result = new ArrayList<>();
		String s = "ewfwefqe";
		s.substring(1);
		int[] nums = {2,4,0,5,6};
		for (int i : threeSum(nums, 9)) {
			System.out.print(i + " ");
		}
	}
	public List<Interval> merge(List<Interval> intervals){
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return 0;
			}
		});
		return intervals;
	}
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < tokens.length; i++){
			String s = tokens[i];
		}
		return 0;
	}

}