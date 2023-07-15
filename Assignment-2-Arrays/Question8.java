
public class Question8 {
	 public static int minimizeScore(int[] nums, int k) {
	        int minVal = nums[0];
	        int maxVal = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            minVal = Math.min(minVal, nums[i]);
	            maxVal = Math.max(maxVal, nums[i]);
	        }

	        int initialScore = maxVal - minVal;
	        if (initialScore == 0) {
	            return 0;
	        }

	        int candidateScore = initialScore;
	        int diff = maxVal - minVal;

	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] <= minVal + k) {
	                maxVal = minVal + k;
	                diff = maxVal - minVal;
	                candidateScore = Math.min(candidateScore, diff);
	            }

	            if (nums[i] >= maxVal - k) {
	                minVal = maxVal - k;
	                diff = maxVal - minVal;
	                candidateScore = Math.min(candidateScore, diff);
	            }
	        }

	        return Math.min(initialScore, candidateScore);
	    }

	    public static void main(String[] args) {
	        int[] nums = { 1 };
	        int k = 0;
	        int minScore = minimizeScore(nums, k);
	        System.out.println("Minimum Score: " + minScore);
	        // Output: Minimum Score: 0
	    }
}
