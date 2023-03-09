package Task2_oop;

public class Car extends Transport implements ServiceCheckTyre,ServiceCheckEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку для автомобиля");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
