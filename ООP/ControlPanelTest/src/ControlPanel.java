public class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control() {
        System.out.println(altimeter.toString());
        System.out.println(airGauge.toString());
    }
}
