//Зроби рефакторинг методу sum() у класі TotalScore. Метод повинен працювати так само, як і працював,
//        але всередині методу не використовуй перехоплення виключення (ключові слова try...catch). Перепиши цей метод на нормально працюючий Java-код.
class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}