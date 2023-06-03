//Власним ім'ям вважається слово, в якому є хоча б дві літери. Перша літера має бути великою, решта - маленькими.
//        Напиши програму, яка рахуватиме кількість власних назв у тексті.
public class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
