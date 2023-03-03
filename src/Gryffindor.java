public class Gryffindor extends Hogvarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int transgressions, int nobility, int honor, int bravery) {
        super(name, powerMagic, transgressions);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int points() {
        return nobility + honor + bravery;
    }

    public void getStrongGryffindor(Gryffindor gryffindor) {
        int point = points();
        int pointPower = gryffindor.points();
        if (point > pointPower) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + gryffindor.getName());
            System.out.println("Сила : "+getName()+" "+ point + " Сила : "+ gryffindor.getName()+ " "+ pointPower);
        } else if (pointPower > point) {
            System.out.println(gryffindor.getName() + " лучший Гриффиндорец, чем " + getName());
            System.out.println("Сила : "+gryffindor.getName()+" "+ pointPower + " Сила : "+getName()+ " "+ point);
        }
    }


    @Override
    public String toString() {
        return "Студент : " + getName() + " сила магии  " + getPowerMagic() + " расстояние трансгресии " + getTransgressions() + " благородство " + getNobility() + " честь " + getHonor() + " храбрость " + getBravery();

    }

}
