import java.util.Arrays;

public class MyHashMap<K, V> {

    private final Node<K, V>[] table;
    private final int capacity = 16;
    private int size;

    public MyHashMap() {
        table = new Node[capacity];
    }

//    public MyHashMap(int capacity) {
//        this.capacity = capacity;
//        table = new Node[capacity];
//    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = hash % capacity;
        Node<K, V> newNode = new Node<>(key, value);

        if (table[index] == null) {
            table[index] = newNode;
            size++;
        } else {
            Node<K, V> currentNode = table[index];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                if (currentNode.next == null) {
                    currentNode.next = newNode;
                    size++;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = hash % capacity;
        Node<K, V> currentNode = table[index];

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void remove(K key) {
        int hash = key.hashCode();
        int index = hash % capacity;

        if (table[index] == null) {
            return;
        }

        if (table[index].key.equals(key)) {
            table[index] = table[index].next;
            size--;
            return;
        }

        Node<K, V> currentNode = table[index].next;
        Node<K, V> previousNode = table[index];

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                previousNode.next = currentNode.next;
                size--;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void clear() {
        Arrays.fill(table, null);
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (size == 0) return "empty";
        for (Node<K, V> node : table) {
            while (node != null) {
                sb.append(node.key).append(" = ").append(node.value).append(", ");
                node = node.next;
            }
        }
        return sb.toString();
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
