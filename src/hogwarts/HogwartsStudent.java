package hogwarts;

public abstract class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compareTo(HogwartsStudent other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println(other.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем " + other.getName());
        } else {
            System.out.printf("Студенты %s и %s равны по мощности магии%n", this.getName(), other.getName());
        }
    }

    private int scoreSum() {
        return magicPower + transgressionDistance;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;

    }
}
