public class Main {

    public static void main(String[] args) {
        String testString = "word1 word2 word3";

        testString = reverseWords(testString);
        System.out.println(testString);
    }

    private static String reverseWords(String testString) {
        String[] strings = testString.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[strings.length-i-1] + " ");
        }

        return sb.toString();
    }
}
