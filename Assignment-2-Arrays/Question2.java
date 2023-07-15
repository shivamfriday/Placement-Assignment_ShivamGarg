import java.util.HashSet;
import java.util.Set;

public class Question2 {

	public static int maxCandies(int[] candyType) {
        Set<Integer> uniqueCandyTypes = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandyTypes.add(candy);
        }
        return Math.min(uniqueCandyTypes.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        int[] candyType = { 1, 1, 2, 2, 3, 3 };
        int maxNumOfCandies = maxCandies(candyType);
        System.out.println("Maximum Number of Candies: " + maxNumOfCandies);
        // Output: Maximum Number of Candies: 3
    }

}
