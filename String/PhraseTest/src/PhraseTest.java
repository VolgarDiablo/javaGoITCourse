//Напиши клас Phrase.
//        У класу має бути публічний конструктор, який приймає один параметр:
//        String[] words - список слів.
//        Конструктор повинен зберегти цей параметр у приватному полі з таким самим ім'ям. Не створюй для цього поля ні геттерів, ні сеттерів.
//        Перевизнач метод toString() у цього класу, щоб він повертав рядок, що складається з елементів поля words, розділених пробілом.
//        Подбай про іммутабельність класу. Якщо ми міняємо масив, який передавали класу Phrase, внутрішнє поле words не повинно змінюватися.
public class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}