//Створи клас GameMenu.
//        У класі GameMenu створи внутрішній статичний абстрактний клас MenuItem. У класу MenuItem створи абстрактний метод getAction(), який повертає рядок.
//        Створи три класи-спадкоємці від класу MenuItem, які реалізують метод getAction():
//        - клас Start, метод getAction() повертає рядок start;
//        - клас Options, метод getAction() повертає рядок options;
//        - клас Exit, метод getAction() повертає рядок exit.
//        У класі GameMenu створи метод void act(MenuItem item). Цей метод приймає елемент меню (примірник класу MenuItem),
//        та виводить у консоль результат виклику методу getAction() у цього елемента.
class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}