public class LinkedList<T> {

    public Node<T> head;
    public int size;

    public class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        head = add(head, data);
    }

    private Node<T> add(Node<T> head, T data) {
        if (head == null) {
            size++;
            return new Node<T>(data);
        } else {
            head.next = add(head.next, data);
        }
        return head;
    }

    public void print() {
        print(head);
    }

    private void print(Node<T> head) {
        if(head == null) {
            System.out.println();
            return;
        } else {
            System.out.print(head.data + "\t");
            print(head.next);
        }
    }
}


