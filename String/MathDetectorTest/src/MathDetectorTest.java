//Напиши клас MathDetector. У цьому класі створи метод public boolean isMath(String text).
//Цей метод приймає текст і повертає true, якщо в тексті є математичні вирази згідно з алгоритмом вище.
//Для пошукової системи Goo текст вважається таким, що в ньому є математичні вирази, якщо:
//        у тексті є хоча б один символ =;
//        у тексті є хоча б один математичний оператор +, -, *, /;
//        у тексті є мінімум 2 цифри.
public class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}