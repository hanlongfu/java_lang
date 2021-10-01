abstract class Shape{

    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape{
    private double radius = 2;

    public double perimeter(){
        return 2 * 3.14 * radius;
    }

    public double area(){
        return 3.14 * 3.14 * radius;
    }
}


class Rectangle extends Shape{
    private double length = 2;
    private double width = 2;

    public double perimeter(){
        return 2*(length + width);
    }

    public double area(){
        return length * width;
    }

}


public class ShapeExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        Shape s2 = new Rectangle();
        System.out.println(s2.perimeter());
        System.out.println(s2.area());
    }
}
