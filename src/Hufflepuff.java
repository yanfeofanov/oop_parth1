public class Hufflepuff extends Hogvarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerMagic, int transgressions, int industriousness, int loyalty, int honesty) {
        super(name, powerMagic, transgressions);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int points(){
        return industriousness+loyalty+honesty;
    }

    public void getStrongHufflepuff(Hufflepuff hufflepuff){
        int point = points();
        int pointPower = hufflepuff.points();
        if (point > pointPower) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + hufflepuff.getName());
            System.out.println("Сила : "+getName()+" "+ point + " Сила : "+ hufflepuff.getName()+ " "+ pointPower);
        } else if (pointPower > point) {
            System.out.println(hufflepuff.getName() + " лучший Пуффендуец, чем " + getName());
            System.out.println("Сила : "+hufflepuff.getName()+" "+ pointPower + " Сила : "+getName()+ " "+ point);
        }
    }

    @Override
    public String toString() {
        return "Студент : " + getName() + " сила магии  " + getPowerMagic() + " расстояние трансгресии " + getTransgressions() + " трудолюбие " + getIndustriousness() + " верность " + getLoyalty() + " честность " + getHonesty();

    }
}
