import java.util.Arrays;

public class MyArrayList {
    private Object[] array;
    private int size;
    private final static int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(Object element) {
        if (size == array.length) resize();
        array[size++] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index: " + index);
        //Object removedObject = array[index];
        array[index] = null;
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
    }

    public void clear() {
//        for (int i = 0; i < size; i++) {
//            array[i] = null;
//        }
        size = 0;
        array = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index: " + index);
        return array[index];
    }

    private void resize() {
        Object[] newArray = new Object[array.length * 3 / 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
