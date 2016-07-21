import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ll_recursion.data"));
            long startTime = System.nanoTime();
            LinkedList<Integer> LL = new LinkedList<Integer>();
            for (int i=0; i<10000; i++) {
                LL.addToTail(new Integer(i));
                long endTime = System.nanoTime();
                bw.write((endTime - startTime) + " " + i + "\n");
                startTime = endTime;
            }
            bw.close();

            bw = new BufferedWriter(new FileWriter("ll_loop.data"));
            startTime = System.nanoTime();
            LL = new LinkedList<Integer>();
            for (int i=0; i<10000; i++) {
                LL.addToHead(new Integer(i));
                long endTime = System.nanoTime();
                bw.write((endTime - startTime) + " " + i + "\n");
                startTime = endTime;
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
