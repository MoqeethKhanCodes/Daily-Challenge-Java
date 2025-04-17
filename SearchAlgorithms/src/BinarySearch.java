public class BinarySearch implements SearchingAlgos {

    @Override
    public int isFoundAtIndex(int[] intArray, int value) {

        int start = 0;
        int end = intArray.length - 1;

        while (start <= end) {

            int mid = start + end / 2;

            if (value == intArray[mid]) {
                return mid;
            } else if (value > intArray[mid]) {
                start = mid + 1; // Search Right
            } else {
                end = mid - 1; // Search Left
            }
        }
        return -1;
    }
}
