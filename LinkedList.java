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

    public void addToTail(T data) {
        head = addToTail(head, data);
    }

    private Node<T> addToTail(Node<T> head, T data) {
        if (head == null) {
            size++;
            return new Node<T>(data);
        } else {
            head.next = addToTail(head.next, data);
        }
        return head;
    }

    public void addToHead(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> curr = new Node<T>(data);
            curr.next = head;
            head = curr;
        }
        size++;
    }

    public void remove(T data) {
        remove(data, false);
    }

    public void remove(T data, boolean all) {
        if (head == null) {
            return;
        } else {
           Node<T> curr = head;
           Node<T> prev = null;
           while (curr != null) {
                if (curr.data.equals(data)) {
                    if (prev == null) {
                        head = curr.next;
                        curr.data = null;
                        curr.next = null;
                    } else {
                        prev.next = curr.next;
                        curr.data = null;
                        curr.next = null;
                    }
                    size--;
                    if (!all) {
                        return;
                    }
                }
                prev = curr;
                curr = curr.next;
            }
        }
    }

    public void print() {
        print(head);
    }

    private void print(Node<T> head) {
        if(head.next == null) {
            System.out.println(head.data);
            return;
        } else {
            System.out.print(head.data + ",");
            print(head.next);
        }
    }
}


