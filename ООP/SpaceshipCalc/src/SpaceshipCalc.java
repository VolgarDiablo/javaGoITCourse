//Напиши клас SpaceshipCalc. У цього класу мають бути такі методи:
//
//        int calculateAirBalloons(int passengerCount).
//        Цей метод повертає загальну кількість балонів зі стисненим повітрям, яке потрібно взяти на космічний корабель,
//        з розрахунку 10 балонів на одного пасажира. Оскільки балони з повітрям – це критична інформація,
//        зроби метод фінальним, щоб навіть якщо хтось успадкується від класу SpaceshipCalc, він не міг перевизначити цей метод.
//
//        int calculateBookCount(int passengerCount).
//        Цей метод повертає кількість паперових книг, які можуть взяти на борт космічний корабель, з розрахунку 2 книги на одного
public class SpaceshipCalc {
    final int calculateAirBalloons(int passengerCount) {
        return passengerCount * 10;
    }

    int calculateBookCount(int passengerCount) {
        return passengerCount * 2;
    }

    public static void main(String[] args) {
        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(35));
        System.out.println(calc.calculateBookCount(50));
    }
}