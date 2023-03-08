package Task2_oop;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car1", 4);
        Car car2 = new Car("Car2", 4);


        Truck truck = new Truck("Truck1", 6);
        Truck truck2 = new Truck("Truck2", 6);


        Bicycle bicycle = new Bicycle("Bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("Bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
