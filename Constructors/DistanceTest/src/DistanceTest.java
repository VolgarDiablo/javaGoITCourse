//Напиши клас Distance, у якого є конструктор Distance(int startX, int startY, int endX, int endY).
//        Цей конструктор приймає 4 параметра - координати початкової точки (startX та startY), та координати кінцевої точки (endX та endY).
//        У класу також має бути метод public int getDistance(). Він повертає відстань між точками,
//        координати яких передано до конструктора. Відстань округляється за правилами математичного округлення, повертається цілий результат.
public class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}