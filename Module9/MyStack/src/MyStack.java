public class MyStack<E> {
    private int size;
    private Node<E> head;

    public void push(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public E peek() {
        if (head == null) {
            return null;
        }
        return head.getValue();
    }

    public E pop() {
        if (head == null) {
            return null;
        }
        E value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0) {
            pop();
        } else {
            Node<E> currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            Node<E> nodeToRemove = currentNode.getNext();
            currentNode.setNext(nodeToRemove.getNext());
            size--;
        }
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

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
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
