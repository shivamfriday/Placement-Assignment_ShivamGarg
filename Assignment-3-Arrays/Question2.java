import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }

            for (int b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }

                int c = b + 1;
                int d = nums.length - 1;

                while (c < d) {
                    int sum = nums[a] + nums[b] + nums[c] + nums[d];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        d--;

                        while (c < d && nums[c] == nums[c - 1]) {
                            c++;
                        }

                        while (c < d && nums[d] == nums[d + 1]) {
                            d--;
                        }
                    } else if (sum < target) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> quadruplets = fourSum(nums, target);
        System.out.println("Unique Quadruplets: " + quadruplets);
        // Output: Unique Quadruplets: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
    }

}
