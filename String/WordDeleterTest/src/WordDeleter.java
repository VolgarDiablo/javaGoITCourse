public class WordDeleter {
    public String remove(String phrase, String[] words) {
        boolean flag = false;
        String[] splitPhrase = phrase.split(" ");

        String newString = "";
        for (String elem : splitPhrase) {
            flag = false;
            for (String str : words) {
                if (elem.equals(str)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) newString += elem + " ";
        }
        return newString.strip();
    }
}
