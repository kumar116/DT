import java.util.*;

public class Graph<T> {

    public ArrayList<Node<T>> DFS(HashMap<Integer, Node<T>> graph, Node<T> node) {
        Stack<Node<T>> nodes = new Stack<Node<T>>();
        nodes.add(node);
        ArrayList<Node<T>> seen = new ArrayList<Node<T>>();
        while (!nodes.isEmpty()) {
            Node<T> currentNode = nodes.pop();
            if (!seen.contains(currentNode)) {
                seen.add(currentNode);
                for (Node<T> connectedNode: graph.get(currentNode.hashCode()).connectedTo) {
                    nodes.add(connectedNode);
                }
            }
        }
        return seen;
    }

    public boolean isCyclic(HashMap<Integer, Node<T>> graph, Node<T> node) {
        Stack<Node<T>> nodes = new Stack<Node<T>>();
        nodes.add(node);
        ArrayList<Node<T>> seen = new ArrayList<Node<T>>();
        while(!nodes.isEmpty()) {
            Node<T> currentNode = nodes.pop();
            if (!seen.contains(currentNode)) {
                seen.add(currentNode);
                for (Node<T> connectedNode: graph.get(currentNode.hashCode()).connectedTo) {
                    if (seen.contains(connectedNode) && connectedNode.connectedTo.contains(currentNode)) {
                        return true;
                    }
                    nodes.add(connectedNode);
                }
            }
        }
        return false;
    }

    public ArrayList<Node<T>> BFS(HashMap<Integer, Node<T>> graph, Node<T> node) {
        Stack<Node<T>> nodes = new Stack<Node<T>>();
        nodes.add(node);

        ArrayList<Node<T>> seen = new ArrayList<Node<T>>();
        while (!nodes.isEmpty()) {
            Node<T> currentNode = nodes.remove(0);
            if (!seen.contains(currentNode)) {
                seen.add(currentNode);
                for (Node<T> connectedNode: graph.get(currentNode.hashCode()).connectedTo) {
                    nodes.add(connectedNode);
                }
            }
        }
        return seen;
    }
}
