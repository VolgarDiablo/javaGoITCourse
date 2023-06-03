public class MyQueue<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E peek() {
        if (head == null) {
            return null;
        }
        return head.getValue();
    }

    public E poll() {
        if (head == null) {
            return null;
        }
        E value = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        Node<E> current = head;
        out.append("[");
        while (current != null) {
            out.append(current.value);
            current = current.next;
            if (current != null) out.append(", ");
        }
        out.append("]");
        return out.toString();
    }

    public static class Node<E> {
        private final E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        public E getValue() {
            return value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
