package prob5;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Employee E1=new Employee();

        System.out.println("Enter the name of the Employee ");
        String name= sc.nextLine();
        E1.setName(name);

        System.out.println("Enter the employee id ");
        int id=sc.nextInt();
        E1.setId(id);

        System.out.println("Enter the 3 assessment values of "+E1.getName());
        E1.ass1= sc.nextInt();
        E1.ass2=sc.nextInt();
        E1.ass3= sc.nextInt();

        E1.result=E1.updateResult();
        E1.total=E1.calculateTotal();
        E1.percentage=E1.percentage();

        System.out.println("---------Details of the Employee----------");
        System.out.print("Name : "+E1.getName()+ "\nEmpID : "+E1.getEmpId()+ "\nAssessment total : "+E1.total+ "\nPercentage obtained : "+E1.percentage + "\nResult : "+E1.result);


    }
}
