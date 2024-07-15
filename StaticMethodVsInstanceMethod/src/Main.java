
class Mobile{
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Instance Methods has access to both static/non-static fields : \n"
                + brand + " : " + price + " : " + name);
    }

    public static void show1 (Mobile mobile) {
        System.out.println("Static Methods have access to non static fields only through object references : \n"
                + mobile.brand + " : " + mobile.price + " : " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile firstMobile = new Mobile();
        firstMobile.brand = "Apple"; // Instance Fields uses object references
        firstMobile.price = 2000;
        Mobile.name = "Smartphone"; //Static Fields use class references

        firstMobile.show(); // Instance Methods uses object references

        Mobile secondMobile = new Mobile();
        secondMobile.brand = "Samsung"; // Instance Fields uses object references
        secondMobile.price = 1500;
        Mobile.name = "Smartphone"; //Static Fields use class references

        Mobile.name = "Phone"; //Object Override
        secondMobile.show(); // Instance Methods uses object references

        Mobile thirdMobile = new Mobile();
        thirdMobile.brand = "Google";
        thirdMobile.price = 999;

        //thirdMobile.show1(thirdMobile); // Bad Practise
        Mobile.show1(thirdMobile); //Static Methods must be accessed via a Class Reference

    }
}