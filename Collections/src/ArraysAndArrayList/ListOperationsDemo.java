package ArraysAndArrayList;

import java.util.*;

public class ListOperationsDemo {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        // ------------------- Immutable List -------------------
        // ✅ Creating an immutable list using List.of() (Java 9+)
        // Immutable: no add, remove, or set operations allowed
        List<String> immutableList = List.of(items);
        //immutableList.add("oranges"); //UnsupportedOperationException
        System.out.println("Immutable List      : " + immutableList);
        System.out.println("List.of() Immutable List ClassType : " + immutableList.getClass().getName());

        /*
         * The following line would result in a compile-time error because
         * ⚠️ Invalid: ArrayList does NOT have a static of() method
         * ArrayList<String> list = ArrayList.of(items); // ❌ Compilation error
         */

        // ------------------- Mutable List -------------------
        // To counter this problem
        // Creating a mutable list by copying from the immutable List.of()
        List<String> mutableList1 = new ArrayList<>(List.of(items));
        System.out.println("Mutable List (copy) : " + mutableList1);
        System.out.println("Mutable List ClassType : " + mutableList1.getClass().getName());

        // ✅ Creating a mutable list using Collections.addAll()
        List<String> mutableList2 = new ArrayList<>();
        Collections.addAll(mutableList2, items);
        System.out.println("Mutable List (addAll): " + mutableList2);

        // ✅ Another example: Copy immutable list to ArrayList and modify
        ArrayList<String> groceries = new ArrayList<>(immutableList);
        groceries.add("yogurt");
        System.out.println("Mutable List (ArrayList copy): " + groceries);

        // ✅ Create and initialize a mutable ArrayList directly using List.of()
        ArrayList<String> moreGroceries = new ArrayList<>(
                List.of("pickles", "mustard", "yogurt", "mayonnaise"));
        System.out.println("More Groceries (ArrayList)   : " + moreGroceries);

        // ------------------- Add Elements -------------------
        // Add All Element into the ArrayList
        moreGroceries.addAll(List.of("pickles", "mustard","apples"));

        System.out.println("Action performed : addAll --> " + moreGroceries);

        // ------------------- Searching -------------------
        if (moreGroceries.contains("mustard")) {
            System.out.println("List(moreGroceries) contains mustard");
        }

        // Case-insensitive search using Streams
        String searchItem = "MuStArD"; // Input with unknown casing

        // Approach 1: Using equalsIgnoreCase() in the stream predicate
        boolean found = moreGroceries.stream()
                .anyMatch(item -> item.equalsIgnoreCase(searchItem));

        if (found) {
            System.out.println("Found (case-insensitive using equalsIgnoreCase): " + searchItem);
        }

        // Approach 2: Converting both stream items and search term to lowercase
        String searchItemLower = searchItem.toLowerCase();

        boolean foundAlt = moreGroceries.stream()
                .map(String::toLowerCase)
                .anyMatch(item -> item.equals(searchItemLower));

        if (foundAlt) {
            System.out.println("Found (case-insensitive using lowercase match)  : " + searchItem);
        }

        // Approach 3: Case-insensitive search without using Streams
        String searchItem1 = "PiCKLes"; // Unknown casing
        boolean found1 = false;

        for (String item : moreGroceries) {
            if (item.equalsIgnoreCase(searchItem1)) {
                found1 = true;
                break; // Exit loop once a match is found
            }
        }

        if (found1) {
            System.out.println("Found (case-insensitive): " + searchItem1);
        } else {
            System.out.println("Not found (case-insensitive): " + searchItem1);
        }

        // ------------------- Index Lookup -------------------
        // Add a duplicate element to demonstrate indexOf() and lastIndexOf()
        moreGroceries.add("yogurt");
        System.out.println("first occurrence of yogurt in the list : " + moreGroceries.indexOf("yogurt"));
        System.out.println("last occurrence of yogurt in the list : " + moreGroceries.lastIndexOf("yogurt"));

        System.out.println("Default --> " + moreGroceries);

        // ------------------- Remove Elements -------------------
        // Remove element by index
        moreGroceries.remove(1);
        System.out.println("Action performed : remove by index --> " + moreGroceries);
        // Remove element by value
        moreGroceries.remove("yogurt");
        System.out.println("Action performed : remove by value --> " + moreGroceries);

        // Remove all specified elements (bulk removal)
        moreGroceries.removeAll(List.of("apples","mustard"));
        System.out.println("Action performed : removeAll --> " + moreGroceries);

        //Clear the list
        moreGroceries.clear();
        System.out.println("isEmpty : " + moreGroceries.isEmpty());

        // ------------------- Re-populate List -------------------
        moreGroceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        moreGroceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        // ------------------- Sorting -------------------
        // Sort the list in ascending order
        System.out.println("Unsorted List  --> Ascending Order : " + moreGroceries);
        moreGroceries.sort(Comparator.naturalOrder());
        System.out.println("Sorted List : " + moreGroceries);
        moreGroceries.sort(Comparator.reverseOrder());
        System.out.println("Sorted List --> Descending Order : " + moreGroceries);

        // ------------------- Conversion -------------------
        var groceryArray = groceries.toArray(new String[moreGroceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
