//створити новий клас AdvancedXFuelEngine, який успадковується від класу XFuelEngine.
//        У цьому класі створити метод printInfo(), який виводитиме у консоль серійний номер
//        та потужність двигуна у форматі "Serial number is <SERIAL NUMBER>, power is <POWER>".
class AdvancedXFuelEngine extends XFuelEngine {
    public void printInfo() {
        System.out.println("Serial number is " + super.serialNumber + ", power is " + super.getPower());
    }
}
