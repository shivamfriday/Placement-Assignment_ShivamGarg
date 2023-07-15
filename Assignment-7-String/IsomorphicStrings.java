import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            // Check if s to t mapping already exists
            if (sToT.containsKey(chS)) {
                if (sToT.get(chS) != chT) {
                    return false; // Mapping violation
                }
            } else {
                // Create a new s to t mapping
                sToT.put(chS, chT);
            }

            // Check if t to s mapping already exists
            if (tToS.containsKey(chT)) {
                if (tToS.get(chT) != chS) {
                    return false; // Mapping violation
                }
            } else {
                // Create a new t to s mapping
                tToS.put(chT, chS);
            }
        }

        return true; // All characters have valid mappings
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean isIsomorphic = isIsomorphic(s, t);

        System.out.println("Are the strings isomorphic? " + isIsomorphic);
    }
}
