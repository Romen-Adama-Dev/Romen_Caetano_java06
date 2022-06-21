class Employee {
    private int id;
    private double salary;
    private String division;

    /*
    Write an Employee class that:
        1. Encapsulate an employee id(of type int), salary(of type double) and division( of type String)
        2. Class should provide getters for all fields
     */

    //Creating setters and getters
    public int getId() {
        return id;
    }
    public void setId(final int id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        salary = newSalary;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(final String division) {
        this.division = division;
    }
}
//Romen Adama Caetano Ramirez