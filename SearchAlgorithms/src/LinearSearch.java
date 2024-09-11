public class LinearSearch implements SearchingAlgos{
    @Override
    public int isFoundAtIndex(int[] intArray, int value) {
        for (int i = 0; i <= intArray.length - 1; i++) {
            if (intArray[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
