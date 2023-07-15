import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put('0', '0');
        mappings.put('1', '1');
        mappings.put('6', '9');
        mappings.put('8', '8');
        mappings.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char chLeft = num.charAt(left);
            char chRight = num.charAt(right);

            if (!mappings.containsKey(chLeft) || mappings.get(chLeft) != chRight) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String num = "69";

        boolean isStrobogrammatic = isStrobogrammatic(num);

        System.out.println("Is the number strobogrammatic? " + isStrobogrammatic);
    }
}
