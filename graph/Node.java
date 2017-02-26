import java.util.ArrayList;

public class Node<T> {
    public T data;
    public ArrayList<Node<T>> connectedTo;

    public Node(T data) {
        this.data = data;
        this.connectedTo = new ArrayList<Node<T>>();
    }

    public boolean isConnectedTo(Node<T> n) {
        if (connectedTo.contains(n)) {
            return true;
        }
        return false;
    }

    public void connectTo(Node<T> n) {
        if (!isConnectedTo(n)) {
            connectedTo.add(n);
        }
    }

    public void disconnectFrom(Node<T> n) {
        if (isConnectedTo(n)) {
            connectedTo.remove(n);
        }
    }

    public String toString() {
        return data + "(" + this.hashCode()%100000 + ")";
    }
}
