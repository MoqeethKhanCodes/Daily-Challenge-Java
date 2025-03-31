import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> concurrentSet = new ConcurrentSkipListSet<>();
        concurrentSet.add("z");
        concurrentSet.add("a");
        concurrentSet.add("f");
        concurrentSet.add("q");


        for (String s : concurrentSet) {
            System.out.println(s);
        }
    }
}
