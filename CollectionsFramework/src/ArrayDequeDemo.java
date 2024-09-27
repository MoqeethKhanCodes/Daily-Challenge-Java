import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("hi");
        arrayDeque.add("khan"); // down/right insertion
        arrayDeque.push("bye"); // top/left insertion

        System.out.println("peek -> " +arrayDeque.peek());

        System.out.println("Order Of Storing : ");

        for (String s: arrayDeque){
            System.out.print(s + "\t");
        }
    }
}
