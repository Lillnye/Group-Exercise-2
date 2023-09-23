public class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car {
    private int length;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        return super.getSalePrice() * (length > 20 ? 0.95 : 0.90);
    }
}

class Truck extends Car {
    private int weight;

    public Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80);
    }
}

class CarLot {
    public static void main(String[] args) {
        Truck t = new Truck(20000, "red", 2001);
        Sedan s = new Sedan(30000, "Blue", 25);
        Car car = new Car(10000, "Pink");
        System.out.println("Truck " + t.getSalePrice());
        System.out.println("Sedan " + s.getSalePrice());
        System.out.println("car " + car.getSalePrice());
    }
}