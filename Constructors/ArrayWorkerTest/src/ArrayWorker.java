public class ArrayWorker {
    public void printElement(int[] array, int index) {
        try {
            System.out.println("value is " + array[index]);
        } catch (Exception e) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);
        }

    }
}
