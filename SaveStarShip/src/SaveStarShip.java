import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }
        return distance;
    }

    public String[] getPlanets(String name) {
        if (name.equals("Miaru")) {
//            String[] str = {"Maux", "Reux", "Piax"};
            return new String[]{"Maux", "Reux", "Piax"};
        }
        return new String[]{};
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("Miaru")));
    }
}