import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        int start = lower;

        for (int num : nums) {
            if (num == start) {
                start++;
            } else if (num > start) {
                result.add(formatRange(start, num - 1));
                start = num + 1;
            }
        }

        if (start <= upper) {
            result.add(formatRange(start, upper));
        }

        return result;
    }

    private static String formatRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 3, 50, 75 };
        int lower = 0;
        int upper = 99;
        List<String> missingRanges = findMissingRanges(nums, lower, upper);
        System.out.println("Missing Ranges: " + missingRanges);
        // Output: Missing Ranges: [2, 4->49, 51->74, 76->99]
    }

}
