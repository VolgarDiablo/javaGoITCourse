//Напиши клас з ім'ям Copyright, у якого буде метод public void print(). Метод виводить у консоль текст "SpaceWarriors Inc.".
//
//        Клас повинен бути фінальним, щоб ніхто не зміг успадкуватись від цього класу.
//
//        клас Copyright оголошено як фінальний
//        виклик new Copyright().print() виводить у консоль текст "SpaceWarriors Inc."
public final class Copyright {
    public void print() {
        System.out.println("SpaceWarriors Inc.");
    }

    public static void main(String[] args) {
        new Copyright().print();
        System.out.println("Hello world!");
    }
}