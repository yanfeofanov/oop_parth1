package Task2_oop;

public interface ServiceCheck {
    default void updateTyre() {
        System.out.println("Нет замены колес");
    }

    default void checkEngine() {
        System.out.println("Нет проверки двигателя");
    }
}
