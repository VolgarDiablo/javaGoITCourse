//Напиши клас HarekDataMaker.У цьому методі створи наступні методи:
//
//public String aggregateSingle(String name,String age,String planet).Він приймає ім'я,
//        вік та планету,і повертає рядок із цими даними у форматі:"name - <NAME>, age - <AGE>, planet - <MARS>"
//
//public String[]aggregateAll(String[]names,int[]ages,String[]planets).Він приймає три масиви,
//        у кожному з яких три елементи.Перший масив-це імена,другий-вік,третій-планети.
//        Повертає масив агрегованих рядків.Обов'язково використовуй для агрегації окремих рядків метод aggregateSingle().
//
//        Розмір кожного з масивів,який передається в метод aggregateAll()-рівно 3елементи.
//
//        Зверни увагу на правильне форматування даних-пробіли,коми,перенесення рядків.Все це – важливі дрібниці.

//        !!!приведе до виведення у консоль наступного тексту:!!!
//
//        name-hter,age-30,planet-Mars
//        ###
//        [name-hter,age-30,planet-Mars,name-pou,age-35,planet-Earth,name-diz,age-70,planet-Jupiter]

import java.util.Arrays;

public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", " + "age - " + age + ", " + "planet - " + planet;
        int i = Math.abs();
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] list = new String[3];
        list[0] = aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]);
        list[1] = aggregateSingle(names[1], Integer.toString(ages[1]), planets[1]);
        list[2] = aggregateSingle(names[2], Integer.toString(ages[2]), planets[2]);
        return list;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"hter", "pou", "diz"};
        int[] ages = new int[]{30, 35, 70};
        String[] planets = new String[]{"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }
}