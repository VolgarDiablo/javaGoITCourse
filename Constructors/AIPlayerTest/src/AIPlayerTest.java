//Допиши метод setHp() у класі AIPlayer так, щоб якщо значення переданого параметра hp було менше 0 або більше 100,
//        то кидався б виняток IllegalArgumentException.
public class AIPlayerTest {
    public static void main(String[] args) {
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}