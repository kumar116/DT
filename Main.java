public class Main {

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
	for (int i=0; i<1000; i++) {
	    LL.add(new Integer(i));
        }
        System.out.println(LL.size);
        LL.print();
    }
}
