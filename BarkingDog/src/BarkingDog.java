public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking == false || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
        return true;
    }
}