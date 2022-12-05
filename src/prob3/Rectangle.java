package prob3;

public class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length*this.breadth;
    }

    public double getPerimeter() {
        return 2*(this.length+this.breadth);
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public static void main(String[] args) {
        Rectangle rec =new Rectangle(10,20);

        System.out.println("Length="+rec.length);
        System.out.println("Breadth="+rec.breadth);
        System.out.println("Area="+rec.getArea());
        System.out.println("Perimeter="+rec.getPerimeter());
    }
}
