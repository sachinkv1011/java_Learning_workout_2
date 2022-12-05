package prob7;

public class GarbageCollection {
    static int counter = 0;
    static int counter2 = 0;

    GarbageCollection() {
        counter++;
    }

    public static void main(String[] args) {
        GarbageCollection t1 = new GarbageCollection();
        GarbageCollection t2 = new GarbageCollection();
        GarbageCollection t3 = new GarbageCollection();
        t1 = null;
        t3=t1;
        System.gc();
        //Runtime.getRuntime().gc();
        System.out.println("Total Instances created:" + counter);
        System.out.println("Total Instances destroyed:" + counter2);
        System.out.println("Instances Alive:" + (counter - counter2));
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called");
        System.out.println("Object garbage  Collected");
        System.out.println("-----------");
        counter2++;
    }
}
