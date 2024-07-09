public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("First Customer");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        System.out.println("____________");

        Customer customer1 = new Customer("Ahmed", 100000000.0, "ahmed@gmail.com");
        System.out.println("Second Customer");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

        Customer customer2 = new Customer("Ahmed", 100000000.0, "ahmed@gmail.com");
        System.out.println("Third Customer");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        Customer customer3 = new Customer("Jane", "jane@gmail.com");
        System.out.println("Fourth Customer");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());


    }
}