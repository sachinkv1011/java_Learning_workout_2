package pack6;

public class Employee {
    static int empNo;
    double salary;
    static double totalSalary;


    public Employee( double salary) {

        empNo++;
        this.salary = salary;
        totalSalary+=this.salary;
    }
    public static void viewAll(){
        System.out.println("Total number of Employees: "+empNo);
        System.out.println("Total salary of "+empNo+" employees is "+totalSalary);
    }
}
