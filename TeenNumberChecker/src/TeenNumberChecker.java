public class TeenNumberChecker {
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){

        return  isTeen(firstAge)||isTeen(secondAge)||isTeen(thirdAge);

        }
    public static boolean isTeen(int num){
        return (num >= 13 && num <= 19);
    }
}
