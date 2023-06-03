//Допиши метод printElement() у класі ArrayWorker так, щоб:
//        якщо переданий індекс менший за розмір масиву, і елемент можна отримати - у консоль виводився б цей елемент;
//        якщо індекс неправильний, і кидається виняток – у консоль виводився б текст wrong index;
//        у будь-якому випадку в кінці ще б виводився рядок index is <INDEX_VALUE>, де замість <INDEX_VALUE> підставлявся б переданий індекс.
//        Не використовуй умовний оператор, лише try...catch...finally.


public class ArrayWorkerTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        //value is 1
        //index is 0
        new ArrayWorker().printElement(array, 0);

        //wrong index
        //index is 10
        new ArrayWorker().printElement(array, 10);
    }
}