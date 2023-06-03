//Напиши клас RectangleArea, у якого є конструктор public RectangleArea(int[] coords).
//        Перші два елемента - це x та y першої точки прямокутника, останні два елементи - це x та y протилежної точки.
//        Цей клас має метод public int getArea(), який повертає площу прямокутника.
class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}