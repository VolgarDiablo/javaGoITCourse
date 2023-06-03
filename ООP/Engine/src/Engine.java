//Напиши клас Engine. У цього класу має бути приватне поле power типу int. Створи геттер та сеттер для цього поля.
//        Також створи метод public String getFuelType(), який повертає тип палива, на якому працює двигун.
//        Цей метод має повертати рядок "A500" - це стандартне паливо.
//        виконання коду System.out.println(new Engine().getFuelType()) повертає "A500"

//Напиши клас XFuelEngine, який успадковується від класу Engine. Перевизнач у класі XFuelEngine метод getFuelType(), щоб той повертав рядок "XFuel".
//        клас XFuelEngine успадкован від класу Engine;
//        виклик System.out.println(new Engine().getFuelType()) виводить у консоль "A500";
//        виклик System.out.println(new XFuelEngine().getFuelType() виводить у консоль "XFuel".
public class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel

        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}