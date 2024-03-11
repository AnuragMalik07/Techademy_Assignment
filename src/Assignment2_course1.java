interface Shape{
    double calculateArea();
    double calculatePeri();
}

class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePeri() {
        return 2*Math.PI*radius;
    }
}

class Rectangle implements Shape{
    double length,width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePeri() {
        return 2*(length+width);
    }
}

class Shapeshape{
    final Shape shape;
    public Shapeshape(Shape shape){
        this.shape=shape;
    }
    public double getArea(){
        return shape.calculateArea();
    }

    public double getPeri(){
        return shape.calculatePeri();
    }
}

public class Assignment2_course1 {
    public static void main(String[] args){
        Circle circle =new Circle(5);
        Rectangle rectangle = new Rectangle(3,4);
        Shapeshape circleService = new Shapeshape(circle);
        System.out.println("Circle Area: " + circleService.getArea());
        System.out.println("Circle Perimeter: " + circleService.getPeri());
        Shapeshape rectangleService = new Shapeshape(rectangle);
        System.out.println("Rectangle Area: " + rectangleService.getArea());
        System.out.println("Rectangle Perimeter: " + rectangleService.getPeri());

    }
}
