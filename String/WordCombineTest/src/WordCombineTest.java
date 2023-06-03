//Напиши клас WordCombine. У цьому класі створи метод public boolean canCombine(String sourceWord, String targetWord).
//Він має повертати true лише в тому випадку, якщо із слова sourceWord можна скласти слово targetWord.
//        виконання коду new WordCombine().canCombine("Forest", "tor") повертає true;
//        виконання коду new WordCombine().canCombine("Magic", "Mama") повертає true;
//        виконання коду new WordCombine().canCombine("War", "Piece") повертає false.
public class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}