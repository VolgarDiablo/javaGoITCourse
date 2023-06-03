public class Main {
    public static void main(String[] args) {
        MyHashMap<Object, Object> map = new MyHashMap<>();

        // Додавання елементів до мапи
        map.put("one", 1);
        map.put(2, "two");
        map.put(3.0, true);

        // Виведення мапи
        System.out.println("Map: " + map.toString());

        // Розмір мапи
        System.out.println("Size: " + map.size());

        // Отримання значення за ключем
        Object key = 2;
        System.out.println("Value for key '" + key + "': " + map.get(key));

        // Видалення елементу за ключем
        key = "one";
        map.remove(key);
        System.out.println("After removing key '" + key + "', map: " + map.toString());

        // Очистка мапи
        map.clear();
        System.out.println("After clear, map: " + map.toString());
    }

}