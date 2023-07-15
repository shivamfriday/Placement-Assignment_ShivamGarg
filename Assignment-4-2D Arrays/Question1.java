import java.util.ArrayList;
import java.util.List;

public class Question1 {

	public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        List<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 5, 7, 9 };
        int[] arr3 = { 1, 3, 4, 5, 8 };

        List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);
        System.out.println("Common Elements: " + commonElements);
        // Output: Common Elements: [1, 5]
    }

}
