//Напиши клас Rectangle, у якого є конструктор public Rectangle(int a, int b). Він приймає два параметри – сторони прямокутника.
//        Напиши метод public boolean canPlaceInto(Rectangle anotherRect). Він приймає інший прямокутник і повертає true,
//        якщо поточний прямокутник можна вписати у прямокутник anotherRect, та false в іншому випадку.
class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}