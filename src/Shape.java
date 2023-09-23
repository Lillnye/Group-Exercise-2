interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }
}

class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;

    }

    @Override
    public double calculateArea() {

        return side * side;
    }

    @Override
    public double calculatePerimeter() {

        return 4 * side;
    }
}
class TestShape{
    public static void main(String[] args) {
        Circle c = new Circle(4);
        Square s = new Square(9);
        System.out.println("Circle area: " + c.calculateArea());
        System.out.println("Circle perimeter: " + c.calculatePerimeter());
        System.out.println("Square area: " + s.calculateArea());
        System.out.println("Square perimeter: " + s.calculatePerimeter());
    }
}