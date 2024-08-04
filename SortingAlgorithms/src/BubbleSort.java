public class BubbleSort implements SortingAlgos {

    @Override
    public void sortData(int[] unsortedArray) {
        boolean swapped;
        for (int k = unsortedArray.length - 1; k > 0; k--) {
            swapped = false;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(unsortedArray, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    public void sortDataDesc(int[] unsortedArray) {

        for (int j = unsortedArray.length - 1; j > 0; j--) {

            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] < unsortedArray[i + 1]) {
                    swap(unsortedArray, i, i + 1);
                }
            }
        }
    }
    public void swap(int[] arr, int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return;
        }
        arr[firstNumber] = arr[firstNumber] ^ arr[secondNumber];
        arr[secondNumber] = arr[firstNumber] ^ arr[secondNumber];
        arr[firstNumber] = arr[firstNumber] ^ arr[secondNumber];
    }
}
