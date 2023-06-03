//Перевизнач у класі Point метод equals(), щоб виклик equals()
//        для об'єктів класу Point з однаковими координатами повертав true, та false, якщо координати відрізняються.
//        Обов'язково допиши анотацію @Override.
//Перевизнач у класі Point метод equals(), щоб виклик equals()
//        для об'єктів класу Point з однаковими координатами повертав true, та false, якщо координати відрізняються. Обов'язково допиши анотацію @Override.
//Напиши у класі Point метод hashCode(), який би працював, як описано вище. Можеш використати Objects.hash()
//        (тоді не забудь імпортувати цей клас із пакета java.util). Або ж можеш написати свою реалізацію, що буде навіть крутіше.

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
        System.out.println(p1.hashCode() == p2.hashCode()); //Should be true
        System.out.println(p1.hashCode() == p3.hashCode()); //Can be true or false
    }
}