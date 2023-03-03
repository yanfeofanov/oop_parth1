public class Slytherin extends Hogvarts {
    private int cunning;
    private int determination;
    private int ambition;

    private int resourcefulness;

    private int lustForPower;

    public Slytherin(String name, int powerMagic, int transgressions, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerMagic, transgressions);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int points(){
        return cunning+determination+ambition+resourcefulness+lustForPower;
    }

    public void getStrongSlytherin(Slytherin slytherin){
        int point = points();
        int pointPower = slytherin.points();
        if(point > pointPower){
            System.out.println(getName() + " лучший Слизеринец, чем " + slytherin.getName());
            System.out.println("Сила : "+getName()+" "+ point + " Сила : "+ slytherin.getName()+ " "+ pointPower);
        }
        else if(pointPower > point){
            System.out.println(slytherin.getName() + " лучший Слизеринец, чем " + getName());
            System.out.println("Сила : "+slytherin.getName()+" "+ pointPower + " Сила : "+getName()+ " "+ point);
        }
    }


    @Override
    public String toString() {
        return "Студент : " + getName() + " сила магии  " + getPowerMagic() + " расстояние трансгресии " + getTransgressions() + " хитрость " + getCunning() + " решительность " + getDetermination() + " амбициозность " + getAmbition() + " находчивость "+ getResourcefulness() + " жажда власти "+ getLustForPower();

    }
}
