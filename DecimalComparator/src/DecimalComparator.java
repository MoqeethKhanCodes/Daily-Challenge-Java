public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double myFirstNumber, double mySecondNumber){
        myFirstNumber = (int)(myFirstNumber*1000);
        mySecondNumber = (int)(mySecondNumber*1000);

        if(myFirstNumber==mySecondNumber){
            return true;
        }
        return false;

    }

}