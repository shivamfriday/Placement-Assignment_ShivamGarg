public class StringShifts {
    public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.equals(goal)) {
                return true;
            }
            s = shiftString(s);
        }

        return false;
    }

    private static String shiftString(String s) {
        StringBuilder shifted = new StringBuilder(s.substring(1));
        shifted.append(s.charAt(0));
        return shifted.toString();
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        boolean canBecomeGoal = canShift(s, goal);

        System.out.println("Can s become goal? " + canBecomeGoal);
    }
}
