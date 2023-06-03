//Напиши клас Spaceport - це буде основою. У цього класу опиши метод public void launch(), який нічого не робить. Це заглушка, далі цей код розширюватимемо.
//      код new Spaceport().launch() не виводить нічого у консоль
//Опиши клас GasStation. У цьому класі напиши метод public void refuel(). Цей метод повинен виводити у консоль текст "Refuel done!".
//      Додай до класу Spaceport приватне поле типу GasStation, назви його gasStation. Відразу проініціалізуй це поле (використовуй вираз new GasStation()).
//      Додай у метод launch() класу Spaceport виклик методу refuel() поля gasStation.
//Опиши клас ServiceTower. У цьому класі напиши метод public void service(). Цей метод повинен виводити у консоль текст "Service done!".
//        Додай до класу Spaceport приватне поле типу ServiceTower, назви його serviceTower. Відразу проініціалізуй це поле (використовуй вираз new ServiceTower()).
//        Додай у метод launch() класу Spaceport виклик методу service() поля serviceTower.
//Опиши клас CompressorStation. У цьому класі напиши метод public void compress(). Цей метод повинен виводити у консоль текст "Compress done!".
//        Додай до класу Spaceport приватне поле типу CompressorStation, назви його compressorStation.
//        Відразу проініціалізуй це поле (використовуй вираз new CompressorStation()).
//        Додай у метод launch() класу Spaceport виклик методу compress() поля compressorStation.
//Опиши клас Radar. У цьому класі напиши метод public void scan(). Цей метод повинен виводити у консоль текст "Scan done!".
//        Додай до класу Spaceport приватне поле типу Radar, назви його radar. Відразу проініціалізуй це поле.
//        Додай у метод launch() класу Spaceport виклик методу scan() поля radar.
//Опиши клас CommandPost. У цьому класі напиши метод public void command(). Цей метод повинен виводити у консоль текст "Fire!".
//        Додай до класу Spaceport приватне поле типу CommandPost, назви його commandPost. Відразу проініціалізуй це поле.
//        Додай у метод launch() класу Spaceport виклик методу command() поля commandPost.
public class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}