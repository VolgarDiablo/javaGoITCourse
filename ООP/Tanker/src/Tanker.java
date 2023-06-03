//Напиши клас Tanker, у якого є:
//
//        приватне поле serialNumber рядкового типу, геттер та сеттер для цього поля;
//        метод protected String getFuelType(), який повертає рядок "A500" - базовий вид палива;
//        метод public void refuel(int amount). Він приймає ціле число - кількість палива, яке заправляємо,
//        та друкує рядок виду - "Add <AMOUNT> of <FUEL TYPE>, tanker serial number is <SERIAL NUMBER>".
//        Замість <AMOUNT> підстав значення параметра amount, замість <FUEL TYPE> - значення getFuelType(), замість <SERIAL NUMBER> - значення поля serialNumber.
//        Напиши клас XFuelTanker, у якого перевизнач метод getFuelType(). Цей метод повинен повертати рядок "XFuel".
//
//        Напиши клас MX200Tanker, у якого перевизнач метод getFuelType(). Цей метод повинен повертати рядок "MX200".
public class Tanker {
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected String getFuelType() {
        return "A500";
    }

    public void refuel(int amount) {
        System.out.println("Add " + amount + " of " + getFuelType() + ", tanker serial number is " + getSerialNumber());
    }

    public static void main(String[] args) {
        Tanker tanker = new Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);//"Add 300 of A500, tanker serial number is SN504030"

//        Tanker tanker = new XFuelTanker();
//        tanker.setSerialNumber("SN504030");
//        tanker.refuel(300);//"Add 300 of XFuel, tanker serial number is SN504030"
//
//        Tanker tanker = new MX200Tanker();
//        tanker.setSerialNumber("SN504030");
//        tanker.refuel(300);//"Add 300 of MX200, tanker serial number is SN504030"
    }
}