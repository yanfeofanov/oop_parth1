package Task2_oop;

public class Main {
    public static void main(String[] args) {
        ServiceCheckTyre car = new Car("Car1", 4);
        ServiceCheckTyre car2 = new Car("Car2", 4);

        ServiceCheckTyre truck = new Truck("Truck1", 6);
        ServiceCheckTyre truck2 = new Truck("Truck2", 6);

        ServiceCheckTyre bicycle = new Bicycle("Bicycle1", 2);
        ServiceCheckTyre bicycle2 = new Bicycle("Bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.checkCar((Car) car);
        station.checkCar((Car) car2);
        station.checkTruck((Truck) truck);
        station.checkTruck((Truck) truck2);
        station.checkBicycle((Bicycle) bicycle);
        station.checkBicycle((Bicycle) bicycle2);

    }
}
