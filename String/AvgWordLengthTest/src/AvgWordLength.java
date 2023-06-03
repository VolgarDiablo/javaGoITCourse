public class AvgWordLength {
    public double count(String phrase) {
        double sumLength = 0;
        double AVGLength = 0;
        String[] splitPhrase = phrase.split(" ");

        for (String elem : splitPhrase) {
            sumLength += elem.length();
        }

        AVGLength = sumLength / splitPhrase.length;
        return AVGLength;
    }
}
