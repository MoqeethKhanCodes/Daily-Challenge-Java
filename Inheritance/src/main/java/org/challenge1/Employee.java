package org.challenge1;

public class Employee extends Worker {
    private long employeeId;
    private String hiredDate;

    private static long employeeIdNo = 700001;

    public Employee(String name, String birthDate, String hiredDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeIdNo++;
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hiredDate='" + hiredDate + '\'' +
                "} " + super.toString();
    }
}
