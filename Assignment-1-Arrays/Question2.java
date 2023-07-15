
public class Question2 {
	
	public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

	public static void main(String[] args) {
		 int[] nums = { 3, 2, 2, 3 };
	        int val = 3;
	        int count = removeElement(nums, val);
	        System.out.println("Count: " + count);
	        System.out.print("nums: [");
	        for (int i = 0; i < count; i++) {
	            System.out.print(nums[i]);
	            if (i < count - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	        // Output: Count: 2, nums: [2, 2]

	}

}
