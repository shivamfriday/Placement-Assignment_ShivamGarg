import java.util.Arrays;

public class Question8 {

	public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = n;

        for (int k = 0; k < n; k++) {
            result[k * 2] = nums[i++];
            result[k * 2 + 1] = nums[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        int[] rearrangedArray = shuffle(nums, n);
        System.out.println("Rearranged Array: " + Arrays.toString(rearrangedArray));
        // Output: Rearranged Array: [2, 3, 5, 4, 1, 7]
    }
}








