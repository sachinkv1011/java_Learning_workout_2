package pack6;

import static pack6.Employee.viewAll;

public class Driver {
    public static void main(String[] args) {
        Employee e1=new Employee(15000);
        Employee e2=new Employee(25000);
        Employee e3=new Employee(1000);

        viewAll();
    }
}
