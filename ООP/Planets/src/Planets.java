//Створи клас Planets. У цьому класі створи наступні константи типу String і задай їм наступні значення:
//
//        MERCURY зі значенням "Mercury"
//        VENUS зі значенням "Venus"
//        EARTH зі значенням "Earth"
//        MARS зі значенням "Mars"
//        JUPITER зі значенням "Jupiter"
//        SATURN зі значенням "Saturn"
//        URANUS зі значенням "Uranus"
//        NEPTUNE зі значенням "Neptune"
//        Оскільки це константи, кожна з них має бути:
//
//        публічною
//        статичною
//        фінальною
//        виклик System.out.println(Planets.MERCURY) виведе у консоль Mercury
//        кожна константа публічна, статична та фінальна
public class Planets {
    public static final String MERCURY = "Mercury";
    public static final String VENUS = "Venus";
    public static final String EARTH = "Earth";
    public static final String MARS = "Mars";
    public static final String JUPITER = "Jupiter";
    public static final String URANUS = "Uranus";
    public static final String NEPTUNE = "Neptune";
    public static final String SATURN = "Saturn";

    public static void main(String[] args) {
        System.out.println(Planets.MERCURY);
    }
}