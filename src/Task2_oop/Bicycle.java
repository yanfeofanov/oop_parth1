package Task2_oop;

public class Bicycle extends Transport implements ServiceCheckTyre {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку для велосипеда");
    }


}


