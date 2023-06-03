public class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 3) result.append(word.toUpperCase()).append(" ");
            else result.append(word.toLowerCase()).append(" ");
        }

        return result.toString().strip();
    }
//    public String join(String[] words) {
//        String result = "";
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            if (word.length() <= 3) {
//                word = word.toUpperCase();
//            } else {
//                word = word.toLowerCase();
//            }
//
//            result += word;
//            if (i != words.length - 1) {
//                result += " ";
//            }
//        }
//        return result;
//    }
}
