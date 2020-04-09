package leetcode659;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,3,3,4,4,5,5,6,6};
		//int[] nums = {1,2,3,3,4};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		CheckIfSplitConsecutiveFunction solution = new CheckIfSplitConsecutiveFunction();
		
		System.out.println("Solution: " + solution.isPossible(nums));
	}
}
