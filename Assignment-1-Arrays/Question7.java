
public class Question7 {
	
	public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }

        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: Output: 1 3 12 0 0
    }
}
//In this Java code, we use two pointers left and right to iterate through the array. If the element at right is non-zero, we swap it with the element at left and increment both pointers. If the element at right is zero, we only increment the right pointer. After the iteration, we set all the remaining elements from left to the end of the array as zero. The main method demonstrates the usage by providing an example input and printing the output.

