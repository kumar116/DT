package kumar116;

public class Stack<T> extends LinkedList<T> {

    public void push(T data) {
        addToHead(data);
    }

    public T pop() {
        return popFromHead();
    }

    public T peek() {
        return (head != null) ? head.data : null;
    }

    public boolean isEmpty() {
      return size == 0;
    }

}
