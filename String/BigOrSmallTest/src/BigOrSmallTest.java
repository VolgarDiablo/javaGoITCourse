//Напиши програму, яка приймає рядок, та повертає рядок за такими критеріями:
//        якщо кількість маленьких літер у рядку більше ніж кількість великих літер - повертається Small;
//        якщо кількість великих літер більша за кількість маленьких - повертається Big;
//        якщо кількість великих і маленьких літер рівна - повертається Same.
//        Пробіли в тексті ігноруй.
//Напиши клас BigOrSmall. У цьому класі створи метод public String calculate(String text). Метод приймає рядок, і повертає рядок згідно з критеріями вище.
public class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}