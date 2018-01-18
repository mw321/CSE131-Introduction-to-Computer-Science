package lab7;

import java.util.Arrays;

public class LeetCode169 {
	public static void main(String[]args) {
		int[]nums1 = {1, 2, 3, 0, 0, 0};
		int[]nums2 = {2, 5, 6};
		merge(nums1, 3, nums2, 3);
		for (int i : nums1) {
			System.out.print(i + " ");
		}
	}
	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int pre = nums[0];
			count++;
			if (nums[i] == pre) {
				count++;
			}
		}
		return 0;
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0){
			for (int i = 0; i < n; i++){
				nums1[i] = nums2[i];
			}
		}
		int begin1 = 0, begin2 = 0;
		while (begin1 < m && begin2 < n) {
			while (begin1 < m && begin2 < n && nums2[begin2] >= nums1[begin1]){
				begin1++;
			}
			if (begin1 < m && begin2 < n) {
				swap(nums1, begin1, nums2, begin2);
			}
		}
		
	}
	public static void swap(int[]nums1, int begin1, int[]nums2, int begin2){
		int temp = nums1[begin1];
		nums1[begin1] = nums2[begin2];
		nums2[begin2] = temp;
	}
}
