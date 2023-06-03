//TASK
// Напиши клас GooWordStat.
//        У класу має бути публічний конструктор, який приймає два параметри:
//
//        word типу String - слово, для якого ми хочемо отримати статистику;
//        freq типу int - скільки разів шукали це слово.
//        Конструктор повинен зберігати ці параметри в приватних полях з такими ж іменами. Для цих полів створи публічні геттери. Сеттерів не створюй, це іммутабельні класи.
//
//        Перевизнач метод toString(), щоб він повертав рядок виду Word is [<WORD>], search freq is <FREQ>. Замість <WORD> використовуй значення поля word.
//
//        Замість <FREQ> підстав рядок в залежності від значення поля freq:
//
//        якщо поле freq менше 1000 - підстав рядок LOW;
//        якщо поле freq більше або дорівнює 1000 та менше 100000 - підстав рядок MEDIUM;
//        якщо поле freq більше або дорівнює 100000 та менше 10000000 - підстав рядок HIGH;
//        якщо поле freq більше або дорівнює 10000000 - підстав рядок EXTRA HIGH.
public class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}