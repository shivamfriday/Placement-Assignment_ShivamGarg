public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            result.insert(0, digit);

            i--;
            j--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        String sum = addStrings(num1, num2);

        System.out.println("Sum: " + sum);
    }
}
