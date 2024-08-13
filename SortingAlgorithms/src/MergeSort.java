public class MergeSort implements SortingAlgos {

    //{19,4,2,1,45,-1}
    @Override
    public void sortData(int[] unsortedArray) {

        mergeSort(unsortedArray);
    }

    //{19,4,2,1,45,-1}
    public void mergeSort (int[] inputArray) {
        /**Split/ Divide the Array*/
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        //Merge first gen sorted arrays
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        /**Merge LeftHalf and RightHalf Sorted Arrays*/
        merge(inputArray, leftHalf, rightHalf);

    }

    //{19,4,2,1,45,-1}
    public void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        //int i = 0, j = 0, k = 0;

        int i = 0; // Iterator for left half
        int j = 0; // Iterator for right half
        int k = 0; // Iterator for merged Array

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {

                inputArray[k] = leftHalf[i];
                i++;
            }else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }


    }

}
