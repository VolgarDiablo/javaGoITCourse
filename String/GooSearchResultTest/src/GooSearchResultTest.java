//Напиши клас GooSearchResult.
//
//        У класу має бути публічний конструктор, який приймає один параметр:
//
//        url типу String - URL сторінки з пошуковою інформацією;
//        Конструктор повинен зберегти цей параметр у приватному полі з таким самим ім'ям. Створи для цього поля публічний геттер. Сеттер не створюй,
//        це іммутабельний клас.
//
//        Напиши у цьому класі метод parseDomain(), який виділятиме домен з поля url.
//
//        Кожне посилання має домен - адресу сайту, де розміщується посилання. Домен йде одразу після протоколу (http:// або https://) і до першого знаку /

public class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());

        //office.com
        System.out.println(new GooSearchResult("https://office.com/?q=123").parseDomain());
    }
}