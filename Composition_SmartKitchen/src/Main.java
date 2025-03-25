public class Main {
    public static void main(String[] args) {

        SmartKitchen myKitchen = new SmartKitchen();
        /*
        myKitchen.getBrewMaster().setHasWorkToDo(true);
        myKitchen.getBrewMaster().brewCoffee();
        myKitchen.getDishWasher().setHasWorkToDo(true);
        myKitchen.getDishWasher().doDishes();
        myKitchen.getIceBox().setHasWorkToDo(true);
        myKitchen.getIceBox().orderFood();
        */
        myKitchen.setKitchenState(true, false, true);
        myKitchen.doKitchenWork();
    }
}