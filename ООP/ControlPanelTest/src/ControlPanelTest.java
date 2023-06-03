//Оголоси клас для вимірювання висоти, назви його Altimeter. Перевизнач у цього класу метод toString(), щоб він повертав текст "Measure height".
//        Оголоси клас для вимірювання тиску атмосфери, назви його AirGauge. Перевизнач у цього класу метод toString(),
//        щоб він повертав текст "Measure air pressure".
//        Оголоси клас ControlPanel. У цього класу оголоси наступні приватні поля:
//        поле з ім'ям altimeter типу Altimeter;
//        поле з ім'ям airGauge типу AirGauge;
//        Відразу проініцілізуй ці поля при оголошенні.
//        Створи метод public void control() у класі ControlPanel. Він повинен виводити у консоль поля altimeter та airGauge.
//        Запусти програму і переконайся, що виконання методу main() у класі ControlPanelTest виводить у консоль правильний результат.
public class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}