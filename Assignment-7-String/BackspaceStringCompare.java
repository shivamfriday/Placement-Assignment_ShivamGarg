public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        String finalS = processString(s);
        String finalT = processString(t);
        
        return finalS.equals(finalT);
    }
    
    private static String processString(String str) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        
        boolean areEqual = backspaceCompare(s, t);
        
        System.out.println("Are the strings equal? " + areEqual);
    }
}
