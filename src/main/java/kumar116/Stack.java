package kumar116;

public class Stack<T> {

    private LinkedList<T> list;
    public Stack() {
        list = new LinkedList<T>();
    }

    public void push(T data) {
        list.addToHead(data);
    }

    public T pop() {
        return list.popFromHead();
    }

    public int size() {
        return list.size;
    }
}
