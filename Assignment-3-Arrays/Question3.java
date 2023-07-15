import java.util.Arrays;

public class Question3 {
	public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Find the first pair of adjacent elements where nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Find the smallest element in the suffix that is greater than nums[i]
            int j = n - 1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Reverse the suffix starting from index i+1
        reverse(nums, i + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPermutation(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));
        // Output: Next Permutation: [1, 3, 2]
    }
}
