public class MergeSortExplanation implements SortingAlgos {

    // Sorts the given unsorted array using the merge sort algorithm.
    @Override
    public void sortData(int[] unsortedArray) {
        mergeSort(unsortedArray); // Initiates the recursive merge sort process
    }

    // Recursively splits the input array into halves and sorts them
    public void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        // Base case: if the array has less than 2 elements, it is already sorted
        if (inputLength < 2) {
            return;
        }

        // Find the middle index to split the array
        int midIndex = inputLength / 2;

        // Create left and right sub arrays
        int[] leftHalf = new int[midIndex]; // Left half of the array
        int[] rightHalf = new int[inputLength - midIndex]; // Right half of the array

        // Populate the left half with elements from the input array
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        // Populate the right half with elements from the input array
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        // Recursively sort both halves
        mergeSort(leftHalf); // Sort the left half
        mergeSort(rightHalf); // Sort the right half

        // Merge the sorted halves back into the original array
        merge(inputArray, leftHalf, rightHalf);
    }

    // Merges two sorted arrays into one sorted array
    public void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length; // Size of the left half
        int rightSize = rightHalf.length; // Size of the right half

        // Initialize iterators for left half, right half, and the merged array
        int i = 0; // Iterator for left half
        int j = 0; // Iterator for right half
        int k = 0; // Iterator for merged array

        // Merge elements from both halves into the input array
        while (i < leftSize && j < rightSize) {
            // Compare elements from both halves and add the smaller one to the merged array
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i]; // Add from left half
                i++; // Move to the next element in the left half
            } else {
                inputArray[k] = rightHalf[j]; // Add from right half
                j++; // Move to the next element in the right half
            }
            k++; // Move to the next position in the merged array
        }

        // Copy remaining elements from the left half, if any
        while (i < leftSize) {
            inputArray[k] = leftHalf[i]; // Add remaining elements from left half
            i++; // Move to the next element in the left half
            k++; // Move to the next position in the merged array
        }

        // Copy remaining elements from the right half, if any
        while (j < rightSize) {
            inputArray[k] = rightHalf[j]; // Add remaining elements from right half
            j++; // Move to the next element in the right half
            k++; // Move to the next position in the merged array
        }
    }
}