package homeTask10;

public class CustomLinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    public CustomLinkedList() {
        this.first = null;
        this.last = null;
    }

    public T getFirst() {
        if (first == null) {
            return null;
        }
        return first.element;
    }
    public T getLast() {
        if (last == null) {
            return null;
        }
        return last.element;
    }
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element, first, null);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            first.prev = newNode;
            first = newNode;
        }
    }

    private static class Node <T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element, Node<T> next, Node<T> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
