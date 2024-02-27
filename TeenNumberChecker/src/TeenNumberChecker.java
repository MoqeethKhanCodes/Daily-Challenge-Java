public class TeenNumberChecker {
    public static boolean hasTeen (int firstPersonAge, int secondPersonAge, int thirdPersonAge) {

        return isTeen(firstPersonAge) || isTeen(secondPersonAge) || isTeen(thirdPersonAge) ;
    }

    public static boolean isTeen (int age) {

        return (age >= 13 && age <= 19) ;
    }
}
