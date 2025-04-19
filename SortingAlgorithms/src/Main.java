import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] unsortedArray1 = {19,4,2,1,45,-1};

        SortingAlgos bubble = new BubbleSort();
        System.out.println("\nUsing BubbleSort: ");
        bubble.sortData(unsortedArray1);
        Arrays.stream(unsortedArray1).forEach(value -> System.out.print(value + " "));

        breakLine();

        int [] unsortedArray2 = {19,4,2,1,45,-1};
        SortingAlgos selection = new SelectionSort();
        System.out.println("\nUsing SelectionSort: ");
        selection.sortData(unsortedArray2);
        Arrays.stream(unsortedArray2).forEach(value -> System.out.print(value + " "));

        breakLine();

        int [] unsortedArray3 = {19,4,2,1,45,-1};
        SortingAlgos insertion = new InsertionSort();
        System.out.println("\nUsing InsertionSort: ");
        insertion.sortData(unsortedArray3);
        Arrays.stream(unsortedArray3).forEach(value -> System.out.print(value + " "));

        breakLine();

        int [] unsortedArray4 = {19,4,2,1,45,-1};

        SortingAlgos merge = new MergeSortExplanation();
        System.out.println("\nUsing MergeSort: ");
        merge.sortData(unsortedArray4);
        Arrays.stream(unsortedArray4).forEach(value -> System.out.print(value + " "));

        breakLine();

        int [] unsortedArray5 = {15, 7, -1, 100, 45};

        SortingAlgos quick = new QuickSort();
        System.out.println("\nUsing QuickSort: ");
        quick.sortData(unsortedArray5);
        Arrays.stream(unsortedArray5).forEach(value -> System.out.print(value + " "));
    }

    public static void breakLine () {

        System.out.println("\n------------------------");

    }
}