public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        boolean isFound = true;

        for (int i = 0; i < targetWord.length(); i++) {
            if (!sourceWord.toLowerCase().contains(String.valueOf(targetWord.toLowerCase().charAt(i)))) {
                isFound = false;
                break;
            }
        }
        return isFound;
    }
}
