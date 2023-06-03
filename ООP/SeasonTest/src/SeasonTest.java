//Вже є написаний абстрактний клас Season, який представляє певний сезон року. Також є клас SeasonTest, за допомогою якого можна вивести інформацію про сезон.
//
//        Напиши такі класи, що успадковуються від класу Season:
//
//        клас Winter, у якого метод getName() повертає "winter", метод isCold() повертає true;
//        клас Spring, у якого метод getName() повертає "spring", метод isCold() повертає false;
//        клас Summer, у якого метод getName() повертає "summer", метод isCold() повертає false;
//        клас Autumn, у якого метод getName() повертає "autumn", метод isCold() повертає true.
//        виклик new SeasonTest().test(new Winter()) повертає "winter is cold";
//        виклик new SeasonTest().test(new Spring()) повертає "spring is warm";
//        виклик new SeasonTest().test(new Summer()) повертає "summer is warm";
//        виклик new SeasonTest().test(new Autumn()) повертає "autumn is cold";

class SeasonTest {
    public String test(Season season) {
        return season.getName() + (season.isCold() ? " is cold" : " is warm");
    }

    public static void main(String[] args) {
        SeasonTest seasonTest = new SeasonTest();

        //Should be winter is cold
        System.out.println(seasonTest.test(new Winter()));

        //Should be spring is warm
        System.out.println(seasonTest.test(new Spring()));

        //Should be summer is warm
        System.out.println(seasonTest.test(new Summer()));

        //Should be autumn is cold
        System.out.println(seasonTest.test(new Autumn()));
    }
}