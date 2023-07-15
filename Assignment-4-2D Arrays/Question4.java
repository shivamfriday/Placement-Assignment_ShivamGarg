import java.util.Arrays;

public class Question4 {
	 public static int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int maxSum = 0;

	        for (int i = 0; i < nums.length; i += 2) {
	            maxSum += nums[i];
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] nums = { 1, 4, 3, 2 };

	        int maxSum = arrayPairSum(nums);
	        System.out.println("Maximized Sum: " + maxSum);
	        // Output: Maximized Sum: 4
	    }
}
