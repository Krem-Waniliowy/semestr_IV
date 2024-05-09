interface Moveable {
    void start();
    void stop();
}

interface Measurable {
    int getWeight();
}

class Car implements Moveable, Measurable {
    private int weight;

    public Car(int weight) {
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public int getWeight() {
        return weight;
    }
}

class Bike implements Moveable, Measurable {
    private int weight;

    public Bike(int weight) {
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Bike started.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped.");
    }

    @Override
    public int getWeight() {
        return weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1500);
        Bike bike = new Bike(20);

        System.out.println("Waga samochodu: " + car.getWeight() + " kg");
        System.out.println("Waga roweru: " + bike.getWeight() + " kg");

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
