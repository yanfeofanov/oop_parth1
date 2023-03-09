package Task2_oop;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceCheck car = new Car("Car1", 4);
        ServiceCheck car2 = new Car("Car2", 4);

        ServiceCheck truck = new Truck("Truck1", 6);
        ServiceCheck truck2 = new Truck("Truck2", 6);

        ServiceCheck bicycle = new Bicycle("Bicycle1", 2);
        ServiceCheck bicycle2 = new Bicycle("Bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.checkCar((Car) car);
        station.checkCar((Car) car2);
        station.checkTruck((Truck) truck);
        station.checkTruck((Truck) truck2);
        station.checkBicycle((Bicycle) bicycle);
        station.checkBicycle((Bicycle) bicycle2);

    }
}
