package org.challenge1;

public class Main {
    public static void main(String[] args) {
        Employee moqeeth = new Employee("Moqeeth", "01/01/1998", "01/01/2021");
        System.out.println(moqeeth);
        System.out.println("Age = " + moqeeth.getAge());
        System.out.println("Pay = " + moqeeth.collectPay());

        Employee khan = new Employee("Khan", "01/01/1997", "01/05/2019");
        System.out.println(khan);
        System.out.println("Age = " + khan.getAge());
        System.out.println("Pay = " + khan.collectPay());

        SalariedEmployee jane = new SalariedEmployee("Jane", "11/10/2000", "01/06/2017", 70000.0);
        System.out.println(jane);
        System.out.println("Jane's Paycheck = $ " + jane.collectPay());

        HourlyEmployee me = new HourlyEmployee("Ahmed Abdul Moqeeth Khan", "21/01/1997", "01/09/2024", 150);
        System.out.println(me);
        System.out.println("Moqeeth's Paycheck = $" + me.collectPay());
        System.out.println("Moqeeth's Holiday Pay = $" + me.getDoublePay());
    }
}
