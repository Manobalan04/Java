package Practice;

import java.util.Arrays;

public class Closest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums= {-1,2,1,-4};
		int target=1;
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                }
                else if (sum > target) {
                    right--;
                } 
                else {
                    System.out.println("The sum closest to the target is: " + sum);
                    return;
                }
            }
        }
        System.out.println("The sum closest to the target is: " + closestSum);
    }
}