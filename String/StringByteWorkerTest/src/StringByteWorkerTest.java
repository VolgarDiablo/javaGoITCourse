//Напиши клас StringByteWorker. У цьому класі створи метод public String process(byte[] bytes).
//Метод приймає на вхід масив байт, робить з цього масиву рядок, наводить його в нижній регістр, і повертає цей рядок.
public class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}
