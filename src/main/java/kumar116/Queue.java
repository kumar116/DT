package kumar116;

public class Queue<T> extends LinkedList<T> {

    public void push(T data) {
        addToHead(data);
    }

    public T pop() {
        return popFromTail();
    }

    public boolean isEmpty() {
      return size == 0;
    }

}
