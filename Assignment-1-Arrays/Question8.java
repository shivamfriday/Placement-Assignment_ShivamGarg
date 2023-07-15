import java.util.Arrays;

public class Question8 {
	public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        for (int num : nums) {
            int idx = Math.abs(num) - 1;
            if (nums[idx] > 0) {
                nums[idx] *= -1;
            } else {
                result[0] = Math.abs(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
        int[] result = findErrorNums(nums);
        System.out.println("Output: " + result[0] + ", " + result[1]);
        // Output: Output: 2, 3  

	}

}
