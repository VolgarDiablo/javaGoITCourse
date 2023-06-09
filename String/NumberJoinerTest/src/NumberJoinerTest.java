//Є клас, який склеює масив чисел у рядок. Він працює правильно, але повільно, тому що в циклі додає до рядка число.
//Постійно виділяється оперативна пам'ять, і якщо давати на вхід великі (десятки тисяч даних) масиви чисел, то програма сповільниться.
//        Перепиши існуючий код класу NumberJoiner з використанням класу StringBuilder,
//        щоб позбутися конкатенації рядків у циклі. В іншому програма повинна працювати так само.
public class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}