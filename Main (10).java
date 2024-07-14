//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("1913588", "Noura", 50000);
        Employee employee2 = new Employee("1917888", "Yara", 90000);
        Employee employee3 = new Employee("1892278", "Sara", 70000);
        Employee employee4 = new Employee("1892278", "Sara", 80000);
        Employee employee5 = new Employee("1128142", "Retaj", 100000);


        System.out.println("Employee ID: " + employee1.getID());
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee Salary: " + employee1.getSalary());
        System.out.println("Employee Annual Salary: " + employee1.getAnnualSalary());
        System.out.println("Employee Salary after 15% raise: " + employee1.raisedSalary(15));
        System.out.println(employee1);
        System.out.println();


        System.out.println("Employee ID: " + employee2.getID());
        System.out.println("Employee Name: " + employee2.getName());
        System.out.println("Employee Salary: " + employee2.getSalary());
        System.out.println("Employee Annual Salary: " + employee2.getAnnualSalary());
        System.out.println("Employee Salary after 15% raise: " + employee2.raisedSalary(15));
        System.out.println(employee2);
        System.out.println();


        System.out.println("Employee ID: " + employee3.getID());
        System.out.println("Employee Name: " + employee3.getName());
        System.out.println("Employee Salary: " + employee3.getSalary());
        System.out.println("Employee Annual Salary: " + employee3.getAnnualSalary());
        System.out.println("Employee Salary after 15% raise: " + employee3.raisedSalary(15));
        System.out.println(employee3);
        System.out.println();



        System.out.println("Employee ID: " + employee4.getID());
        System.out.println("Employee Name: " + employee4.getName());
        System.out.println("Employee Salary: " + employee4.getSalary());
        System.out.println("Employee Annual Salary: " + employee4.getAnnualSalary());
        System.out.println("Employee Salary after 15% raise: " + employee4.raisedSalary(15));
        System.out.println(employee4);
        System.out.println();


        System.out.println("Employee ID: " + employee5.getID());
        System.out.println("Employee Name: " + employee5.getName());
        System.out.println("Employee Salary: " + employee5.getSalary());
        System.out.println("Employee Annual Salary: " + employee5.getAnnualSalary());
        System.out.println("Employee Salary after 15% raise: " + employee5.raisedSalary(15));
        System.out.println(employee5);
        System.out.println();



    }
}