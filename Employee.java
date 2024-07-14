public class Employee {


    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raisedSalary(int percent) {
        this.salary = (int)(this.salary * (1 + (percent / 100.0)));
        return this.salary;
    }


    public String toString() {
        return "Employee [id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "]";
    }
}
