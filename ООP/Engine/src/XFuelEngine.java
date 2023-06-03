//Напиши клас XFuelEngine, який успадковується від класу Engine. Перевизнач у класі XFuelEngine метод getFuelType(), щоб той повертав рядок "XFuel".
//        клас XFuelEngine успадкован від класу Engine;
//        виклик System.out.println(new Engine().getFuelType()) виводить у консоль "A500";
//        виклик System.out.println(new XFuelEngine().getFuelType() виводить у консоль "XFuel".
//додати до класу XFuelEngine рядкове поле serialNumber з модифікатором доступу protected, і зробити для нього публічний сеттер. Геттер робити не потрібно
public class XFuelEngine extends Engine {
    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String getFuelType() {
        return "XFuel";
    }
}