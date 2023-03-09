package Task2_oop;

public class Bicycle extends Transport implements ServiceCheck {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}


