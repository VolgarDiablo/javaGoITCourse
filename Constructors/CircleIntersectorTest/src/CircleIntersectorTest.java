//Напиши клас CircleIntersector. Створи у цього класу конструктор public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2).
//        Параметри x1, y1, r1 - це координати першого кола. Параметри x2, y2, r2 - це координати другого кола.
//        Перевизнач метод toString() так, щоб він повертав intersects, якщо кола перетинаються, та not intersects, якщо не перетинаються.


public class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}