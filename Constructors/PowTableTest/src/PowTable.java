public class PowTable {
    public static final int[] POWERS_2 = new int[10];

    static {
        int number = 1;
        for (int i = 0; i < POWERS_2.length; i++) {
            POWERS_2[i] = number * number;
            number++;
        }
    }
}
