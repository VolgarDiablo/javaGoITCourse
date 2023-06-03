public class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    }
//    private String reverse(String word) {
//        String result = "";
//        char[] chars = word.toCharArray();
//        for (char c : chars) {
//            result = c + result;
//        }
//        return result;
//    }
}
