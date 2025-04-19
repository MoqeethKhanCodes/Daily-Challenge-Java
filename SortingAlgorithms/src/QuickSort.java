import java.util.Random;

public class QuickSort implements SortingAlgos {
    @Override
    public void sortData(int[] unsortedArray) {

//        int[] array = {15, 7, -1, 100};

        quickSort(unsortedArray, 0, unsortedArray.length - 1);

    }


    public void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];

        int partitionIndex = partitionAroundPivot(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, partitionIndex - 1);
        quickSort(array, partitionIndex, highIndex);
    }


    private int partitionAroundPivot(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer <= rightPointer) {
            while (array[leftPointer] < pivot) {
                leftPointer++;
            }

            while (array[rightPointer] > pivot) {
                rightPointer--;
            }
            if (leftPointer <= rightPointer) {
                swap(array, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }
        return leftPointer;
    }


    public void swap(int[] array, int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return;
        }
        array[firstNumber] = array[firstNumber] ^ array[secondNumber];
        array[secondNumber] = array[firstNumber] ^ array[secondNumber];
        array[firstNumber] = array[firstNumber] ^ array[secondNumber];
    }
}
