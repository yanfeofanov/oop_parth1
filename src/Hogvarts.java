public abstract class Hogvarts {
    private String name;
    private int powerMagic;
    private int transgressions;

    public Hogvarts(String name, int powerMagic, int transgressions) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgressions = transgressions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressions() {
        return transgressions;
    }

    public void setTransgressions(int transgressions) {
        this.transgressions = transgressions;
    }

    private int points() {
        return powerMagic + transgressions;
    }

    public void print() {
        System.out.println(this);
    }

    public void getStrongHogvarts(Hogvarts hogvarts){
        int point = points();
        int pointPower = hogvarts.points();
        if (point > pointPower) {
            System.out.println(getName() + " обладает большей мощью магии, чем " + hogvarts.getName());
            System.out.println("Сила : "+getName()+" "+ point + " Сила : "+ hogvarts.getName()+ " "+ pointPower);
        } else if (pointPower > point) {
            System.out.println(hogvarts.getName() + " обладает большей мощью магии, чем " + getName());
            System.out.println("Сила : "+hogvarts.getName()+" "+ pointPower + " Сила : "+getName()+ " "+ point);
        }
    }

    @Override
    public String toString() {
        return "Студент : " + name + " сила магии : " + powerMagic + " расстояние трансгресии " + transgressions;
    }
}
