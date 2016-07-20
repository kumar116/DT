public class Main {

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        for (int i=0; i<10; i++) {
            LL.addToTail(new Integer(i));
        }
        System.out.println(LL.size);
        LL.print();

        LL = new LinkedList();
        for (int i=0; i<10; i++) {
            LL.addToHead(new Integer(i));
        }
        System.out.println(LL.size);
        LL.print();

        for(int i=0; i<10; i=i+2) {
            LL.remove(new Integer(i));
        }
        System.out.println(LL.size);
        LL.print();
    }
}
