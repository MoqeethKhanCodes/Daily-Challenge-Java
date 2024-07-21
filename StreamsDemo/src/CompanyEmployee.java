public class CompanyEmployee {
    private String name;
    private String department;
    private String employmentType;
    private double salary;

    public CompanyEmployee(String name, String department, String employmentType, double salary) {
        this.name = name;
        this.department = department;
        this.employmentType = employmentType;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
