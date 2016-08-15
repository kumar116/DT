public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        System.out.println(s.size());
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.size());
        System.out.println(s.pop()); // 1
        System.out.println(s.size());
        System.out.println(s.pop()); // 2
        System.out.println(s.size());
        System.out.println(s.pop()); // 3
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
