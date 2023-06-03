//Напиши клас WordFreqCounter. У цьому класі опиши метод public float countFreq(String phrase, String word).
//Метод приймає на вхід рядок phrase та слово word, і повертає частоту входження слова у фразу.
//        Вхідна фраза phrase складається з окремих слів, розділених пробілами. Гарантується, що у вхідному рядку є лише слова,
//        розділені одиночними пробілами, і немає інших символів (знаків пунктуації).
//        Програма повинна ігнорувати регістр літер (слова, що складаються з маленьких та великих літер, вважаються однаковими).
public class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}