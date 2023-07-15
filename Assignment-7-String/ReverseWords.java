public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();

            result.append(reversedWord).append(" ");
        }

        // Remove the trailing whitespace
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Let's code together";

        String reversedSentence = reverseWords(s);

        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
