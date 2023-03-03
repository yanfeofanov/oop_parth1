import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Gryffindor harry = randomGryffindor("Гарри Поттер");
        Gryffindor ron = randomGryffindor("Рон Уизли");
        Gryffindor hermione = randomGryffindor("Гермиона Грейнджер");
        Slytherin draco = randomSlytherin("Драко Малфой");
        Slytherin graham = randomSlytherin("Грэхэм Монтегю");
        Slytherin gregory = randomSlytherin("Грегори Гойл");
        Hufflepuff zechariah = randomHufflepuff("Захария Смит");
        Hufflepuff cedric = randomHufflepuff("Седрик Диггори");
        Hufflepuff justin = randomHufflepuff("Джастин Финч-Флетчли");
        Ravenclaw zhou = randomRavenclaw("Чжоу Чанг");
        Ravenclaw padma = randomRavenclaw("Падма Патил");
        Ravenclaw marcus = randomRavenclaw("Маркус Белби");

        System.out.println();
        harry.print();
        ron.print();
        hermione.print();
        System.out.println();
        draco.print();
        graham.print();
        gregory.print();
        System.out.println();
        zechariah.print();
        cedric.print();
        justin.print();
        System.out.println();
        zhou.print();
        padma.print();
        marcus.print();
        System.out.println();

        harry.getStrongGryffindor(hermione);
        System.out.println();
        draco.getStrongSlytherin(graham);
        System.out.println();
        zechariah.getStrongHufflepuff(justin);
        System.out.println();
        zhou.getStrongRavencklaw(marcus);
        System.out.println();
        harry.getStrongHogvarts(draco);
    }

    private static Gryffindor randomGryffindor(String name) {
        return new Gryffindor(name, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }
    private static Slytherin randomSlytherin(String name) {
        return new Slytherin(name, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100),RANDOM.nextInt(100),RANDOM.nextInt(100));
    }

    private static Hufflepuff randomHufflepuff(String name) {
        return new Hufflepuff(name, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }
    private static Ravenclaw randomRavenclaw(String name) {
        return new Ravenclaw(name, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100),RANDOM.nextInt(100));
    }
}