package prob1;

import java.util.Scanner;

public class MathOperation {
    static double x;
    static double y;
    static double R;

        public static void init() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Initializing x and y");
            System.out.println("Enter the values for x and y");
            x = sc.nextInt();
            y = sc.nextInt();
        }

    public static void Add(){
        R=x+y;
        System.out.println("Sum of "+x +" and "+y +" is :");
        display(R);
    }

    public static void display(double r) {
        System.out.println(R);
    }
    public static void Mul(double x,double y){
        R=x*y;
        System.out.println("Product of "+x +" and "+y +" is :");
        display(R);
    }
    public static void Pow(){
        R=Math.pow(x,y);
        System.out.println("Power of "+x +" over "+y +" is :");
        display(R);
    }

    public static void main(String[] args) {
        MathOperation ob=new MathOperation();

        init();
        Add();
        Mul(MathOperation.x,MathOperation.y);
        Pow();
    }
}
