public class Ravenclaw extends Hogvarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int powerMagic, int transgressions, int mind, int wisdom, int wit, int creation) {
        super(name, powerMagic, transgressions);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    private int points(){
        return mind+wisdom+wit+creation;
    }

    public void getStrongRavencklaw(Ravenclaw ravenclaw){
        int point = points();
        int pointPower = ravenclaw.points();
        if(point > pointPower){
            System.out.println(getName() + " лучший Слизеринец, чем " + ravenclaw.getName());
            System.out.println("Сила : "+getName()+" "+ point + " Сила : "+ ravenclaw.getName()+ " "+ pointPower);
        }
        else if(pointPower > point){
            System.out.println(ravenclaw.getName() + " лучший Слизеринец, чем " + getName());
            System.out.println("Сила : "+ravenclaw.getName()+" "+ pointPower + " Сила : "+getName()+ " "+ point);
        }

    }

    @Override
    public String toString() {
        return "Студент : " + getName() + " сила магии  " + getPowerMagic() + " расстояние трансгресии " + getTransgressions() + " ум " + getMind() + " мудрость " + getWisdom() + " остроумие " + getWit() + " творчество " + getCreation();

    }
}
