import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {

        // Not Recommended | As we cannot check the type at compile-time.
        Object[] groceryObjectArray = new Object[3];
        groceryObjectArray[0] = new GroceryItem("milk");
        groceryObjectArray[1] = new GroceryItem("apples","PRODUCE", 7);
        groceryObjectArray[2] = "6 Oranges";
        System.out.println("groceryObjectArray : " + Arrays.toString(groceryObjectArray));

        System.out.println("----------------");

        // Recommended to use specific type | As it allows Compile-Time type Checking
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("chips");
        groceryArray[1] = new GroceryItem("tomato","PRODUCE", 7);
        //groceryArray[2] = "6 Oranges"; Compile Time Error Checking
        groceryArray[2] = new GroceryItem("potato","PRODUCE", 10);
        System.out.println("groceryArray : " + Arrays.toString(groceryArray));

        System.out.println("----------------");
        // Not Recommended | Raw use of parameterized class 'ArrayList' | Results in the compiler treating them as part Object class
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        //System.out.println(Arrays.toString(objectList));// cannot compile | Error: incompatible types: java.util.ArrayList cannot be converted to java.lang.Object[]
        for (Object o : objectList) {
            System.out.println(o);
        }

        System.out.println("----------------");

        // Recommended | Correct way to use Collections Classes
        ArrayList<GroceryItem> groceryList = new ArrayList<>(); // Here <> is called a Diamond Operator meaning Java can infer the type at Runtime
        groceryList.add(new GroceryItem("Cheese"));
        groceryList.add(new GroceryItem("banana","FRUITS", 12));

        // Overloaded add(index, element) method: Inserts the element at the specified index.
        // Existing elements from that index onward are shifted one position to the right.
        groceryList.add(0,
                new GroceryItem("Pears", "FRUITS", 3));

        // The set(index, element) method replaces the element at the specified index.
        // It does not shift any elements, unlike add(index, element).
        groceryList.set(1,
                new GroceryItem("pears", "FRUITS", 5));

        groceryList.remove(2);

        System.out.println("groceryList : " + groceryList);
    }
}