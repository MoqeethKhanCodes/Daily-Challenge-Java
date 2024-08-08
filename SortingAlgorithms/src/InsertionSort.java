public class InsertionSort implements SortingAlgos{
    @Override
    public void sortData (int[] unsortedArray) {
        //{19,4,2,1,45,-1}
        for (int i = 1; i < unsortedArray.length; i++) {
            int currentValue = unsortedArray[i];
            int j = i - 1;
            while (j >= 0 && currentValue < unsortedArray[j]) {
                swap(unsortedArray, j + 1, j);
                j--;
            }
        }
    }

    public void swap (int[] arr, int firstNumber, int secondNumber) {
        arr[firstNumber] = arr[firstNumber] + arr[secondNumber];
        arr[secondNumber] = arr[firstNumber] - arr[secondNumber];
        arr[firstNumber] = arr[firstNumber] - arr[secondNumber];
    }
}
