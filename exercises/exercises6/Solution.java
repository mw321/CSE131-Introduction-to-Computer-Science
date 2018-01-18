package exercises6;

public class Solution {
	public static void rotate(int[] nums, int k) {
		int p1 = 0; int p2 = 1;
		int n = 0;
		while (k != 0 && n != (nums.length - k) % nums.length) {
			while (p2 < nums.length) {
				swap(nums, p1++, p2++);
			}
			p1 = 0; p2 = 1;
			n++;
		}
	}
	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		rotate(nums, 4);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
