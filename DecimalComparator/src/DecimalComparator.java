public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        return (int) (firstValue * 1000) == (int) (secondValue * 1000);
    }
}