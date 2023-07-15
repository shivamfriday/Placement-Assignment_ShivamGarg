import java.util.HashMap;
import java.util.Map;

public class Question3 {

	 public static int findLHS(int[] nums) {
	        Map<Integer, Integer> freqMap = new HashMap<>();
	        for (int num : nums) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }
	        
	        int maxLen = 0;
	        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
	            int num = entry.getKey();
	            int freq = entry.getValue();
	            
	            if (freqMap.containsKey(num + 1)) {
	                int currLen = freq + freqMap.get(num + 1);
	                maxLen = Math.max(maxLen, currLen);
	            }
	            
	            if (freqMap.containsKey(num - 1)) {
	                int currLen = freq + freqMap.get(num - 1);
	                maxLen = Math.max(maxLen, currLen);
	            }
	        }
	        
	        return maxLen;
	    }

	    public static void main(String[] args) {
	        int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
	        int maxLength = findLHS(nums);
	        System.out.println("Length of Longest Harmonious Subsequence: " + maxLength);
	        // Output: Length of Longest Harmonious Subsequence: 5
	    }

}
