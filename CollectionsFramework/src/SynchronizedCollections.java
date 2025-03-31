import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SynchronizedCollections {
    public static void main(String[] args) {
        // Create a TreeSet and wrap it with Collections.synchronizedSet to ensure thread safety
        Set<String> synchronizedTreeSet = Collections.synchronizedSet(new TreeSet<>());

        // Adding elements to the synchronized TreeSet
        synchronizedTreeSet.add("Apple");
        synchronizedTreeSet.add("Banana");
        synchronizedTreeSet.add("Orange");

        // Synchronizing on the set while iterating (to avoid ConcurrentModificationException)
        synchronized (synchronizedTreeSet) {
            for (String fruit : synchronizedTreeSet) {
                System.out.println(fruit);
            }
        }
    }
}
