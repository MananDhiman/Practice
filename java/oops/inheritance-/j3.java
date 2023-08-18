public class j3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.getArea();    
    }
    
}

abstract class Shape {
    abstract void getArea();
}

class Rectangle extends Shape{
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override void getArea() {
        System.out.println("The area is " + (length * breadth));
    }
}