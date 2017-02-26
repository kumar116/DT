import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Node<Person>> graph = new HashMap<Integer, Node<Person>>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            int nodes = Integer.parseInt(br.readLine());

            for (int i=0; i<nodes; i++) {
                Node<Person> node = new Node(new Person(br.readLine()));
                graph.put(node.hashCode(), node);
            }

            for (int i=0; i<nodes; i++) {
                String[] edges = br.readLine().split(",");
                Node<Person> root = graph.get(Integer.parseInt(edges[0]));
                for (int j=1; j<edges.length; j++) {
                    Node<Person> leaf = graph.get(Integer.parseInt(edges[j]));
                    root.connectTo(leaf);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Graph<Person> graphFunctions = new Graph<Person>();
        Integer key = (Integer)graph.keySet().toArray()[0];

        ArrayList<Node<Person>> dfsList= graphFunctions.DFS(graph, graph.get(key));
        for(Node<Person> node: dfsList) {
            System.out.print(node + "\t");
        }

        System.out.println();
        ArrayList<Node<Person>> bfsList= graphFunctions.BFS(graph, graph.get(key));
        for(Node<Person> node: bfsList) {
            System.out.print(node + "\t");
        }

        System.out.println();
        boolean isCyclic = graphFunctions.isCyclic(graph, graph.get(key));
        System.out.println(isCyclic);
    }
}
