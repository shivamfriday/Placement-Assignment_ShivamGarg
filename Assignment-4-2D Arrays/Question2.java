import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question2 {
	public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> notInNums2 = new ArrayList<>();
        List<Integer> notInNums1 = new ArrayList<>();

        for (int num : nums1) {
            if (!set2.contains(num)) {
                notInNums2.add(num);
            }
        }

        for (int num : nums2) {
            if (!set1.contains(num)) {
                notInNums1.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(notInNums2);
        answer.add(notInNums1);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };

        List<List<Integer>> distinctIntegers = findDistinctIntegers(nums1, nums2);
        System.out.println("Distinct Integers: " + distinctIntegers);
        // Output: Distinct Integers: [[1, 3], [4, 6]]
    }
}
