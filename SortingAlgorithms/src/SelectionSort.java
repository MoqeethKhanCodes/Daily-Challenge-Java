public class SelectionSort implements SortingAlgos{

    //@Override
    public void sortData(int[] unsortedArray) {
        int size = unsortedArray.length;
        for (int i = 0; i < size - 1; i++) {
            int smallestValueIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (unsortedArray[j] < unsortedArray[smallestValueIndex]) {
                    smallestValueIndex = j;
                }
            }
            if (smallestValueIndex != i) {
                swap(unsortedArray, i, smallestValueIndex);
            }
        }
    }


    public void sortDataDesc(int[] unsortedArray) {
        int n = unsortedArray.length;
        for (int i = 0; i < n - 1; i++) {
            int largestValueIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (unsortedArray[j] > unsortedArray[largestValueIndex]) {
                    largestValueIndex = j;
                }
            }
            if (largestValueIndex != i) {
                swap(unsortedArray, i, largestValueIndex);
            }
        }
    }

    public void swap(int[] arr, int first, int second) {
        arr[first] = arr[first] ^ arr[second];
        arr[second] = arr[first] ^ arr[second];
        arr[first] = arr[first] ^ arr[second];
    }
}
