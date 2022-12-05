package prob8;
public class Swap {
    int num1;
    int num2;


    Swap(int a,int b){
        num1=a;
        num2=b;
    }

    public void callReference(Swap ob){
        int temp=ob.num1;
        ob.num1= ob.num2;
        ob.num2=temp;

    }
    void callByValue(int a,int b){
        this.num1=b;
        this.num2=a;

    }
}
class Swapping{
    public static void main(String[] args) {
        Swap s=new Swap(4,5);
        System.out.println("Before swapping");
        System.out.println("num1 :"+s.num1+" \nnum2 :"+s.num2);


        System.out.println("\nswap by value");
        s.callByValue(6,7);
        System.out.println("num1 :"+s.num1+ "\nnum2 :"+s.num2);



        System.out.println("\nSwap by reference");
        s.callReference(s);
        System.out.println("num1 :"+s.num1+ "\nnum2 :"+s.num2);
    }
}
