//Напиши клас QuarkeTrack, у якого є конструктор public QuarkeTrack(int[] lines). Цей конструктор приймає масив із цілих чисел.
//        Кожне ціле число – це довжина пробіжки гравця. Пробіжка гравця за раунд – це сума всіх окремих пробіжок.
//        Перевизнач метод equals(), щоб об'єкти QuarkeTrack з однаковою довжиною пробіжки гравця за раунд повертали true при порівнянні їх методом equals().
//        Також перевизнач метод hashCode(). Можеш використати Objects.hash() (тоді не забудь імпортувати цей клас із пакета java.util).
//        Необов'язково використовувати саме цей метод, але він дуже зручний
class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}