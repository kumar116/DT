import java.io.*;

public class Main {

    public static void runAddToTail() {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void runAdd() {
         try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ll_recursion.data"));
            long startTime = System.nanoTime();
            LinkedList<Integer>  LL = new LinkedList<Integer>();
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

    public static void runJavaUtilAdd() {
         try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ll_recursion.data"));
            long startTime = System.nanoTime();
            java.util.LinkedList<Integer> ll = new java.util.LinkedList<Integer>();
            for (int i=0; i<10000; i++) {
                ll.add(new Integer(i));
                long endTime = System.nanoTime();
                bw.write((endTime - startTime) + " " + i + "\n");
                startTime = endTime;
            }
            bw.close();
       } catch (Exception e) {
            e.printStackTrace();
       }
    }

    public static void runAddRemove() {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        System.out.println(ll.contains(new Integer(0)));
        for(int i=0; i<100; i++) {
            ll.addToHead(new Integer(i));
        }
        System.out.println(ll.contains(new Integer(0)));
        System.out.println(ll.contains(new Integer(45)));
        System.out.println(ll.contains(new Integer(100)));
        ll.remove(new Integer(0));
        ll.remove(new Integer(99));
        ll.remove(new Integer(45));
        System.out.println(ll.contains(new Integer(0)));
        System.out.println(ll.contains(new Integer(99)));
        System.out.println(ll.contains(new Integer(45)));
        System.out.println(ll.size);
        System.out.println();
        ll.print();
    }

    public static void main(String[] args) {
        runAddToTail();
        runAdd();
        runJavaUtilAdd();
        runAddRemove();
    }
}
