//Напиши клас WaterCounter. У цьому класі створи метод public double count(String text).
//Він приймає рядок і повертає водянистість - відношення кількості пробілів у тексті до загальної кількості символів у тексті.
//        Ніяк не округляй результат, що повертається.
//        виклик коду new WaterCounter().count("Moon invaders") повертає 0.07692307692307693;
//        виклик коду new WaterCounter().count("NoWater") повертає 0.
public class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}