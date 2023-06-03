//Створи клас Level, у цього класу створи публічний конструктор, який приймає рядок - назву рівня. Перевизнач метод toString() у класу Level так,
//        щоб він повертав рядок виду Quarke level, name is <LEVEL_NAME>, де <LEVEL_NAME> - це передана в конструктор назва рівня.
//У класі Level опиши статичний внутрішній клас з ім'ям Point. У цього класу мають бути два приватні поля типу int з ім'ям x та y.
//        Для кожного поля створи публічний геттер. Також у цього класу має бути публічний конструктор, який приймає ці два параметри.
//        Додай класу Level приватне поле Point[] points, та заміни конструктор Level(String name) на конструктор Level(String name, Point[] points).
//        Зміни метод toString() у класу Level так, щоб він повертав рядок виду Quarke level, name is <LEVEL_NAME>, point count is <POINT_COUNT>,
//        де <LEVEL_NAME> - ім'я рівня, а <POINT_COUNT> - кількість точок.
//У класі Level опиши статичний внутрішній клас з ім'ям LevelInfo.
//        У класу LevelInfo мають бути два приватні поля типу String з іменами name та difficulty - ім'я та складність рівня відповідно.
//        Для цих полів оголоси публічні геттери.
//        Також створи публічний конструктор LevelInfo(String name, String difficulty), в якому ти задаси значення цим властивостям.
//        У класу Level видали поле String name. Замість нього додай поле LevelInfo levelInfo,
//        і приймай саме це поле першим параметром у конструкторі класу Level замість поля String name.
//        Зміни метод toString() у класу Level так, щоб він повертав рядок Quarke level, name is <LEVEL_NAME>, difficulty is <DIFFICULTY>,
//        point count is <POINT_COUNT>. Замість <LEVEL_NAME> <DIFFICULTY> <POINT_COUNT> підстав значення назви рівня, складності та кількості точок рівня відповідно.
//У класі Level напиши метод calculateLevelHash(), який би повертав число відповідно до описаного вище алгоритму.

public class LevelTest {
    public static void main(String[] args) {
//        Quarke level, name is Test
//        System.out.println(new Level("Test"));

//        Level.Point p1 = new Level.Point(3, 5);
//        Level.Point p2 = new Level.Point(10, 100);
//        Level.Point p3 = new Level.Point(50, 40);
//
//        Level.Point[] points = {p1, p2, p3};
//
//        //Quarke level, name is Test, point count is 3
//        System.out.println(new Level("Test", points));
//
//        Level.Point p1 = new Level.Point(3, 5);
//        Level.Point p2 = new Level.Point(10, 100);
//        Level.Point p3 = new Level.Point(50, 40);
//
//        Level.Point[] points = {p1, p2, p3};
//
//        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");
//
//        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
//        System.out.println(new Level(info, points));

        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}