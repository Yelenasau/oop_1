import java.util.Objects;

public class Ravenclaw extends  Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String student, int magic, int transgression, String faculty, int mind, int wisdom, int wit, int creative) {
        super(student, magic, transgression, faculty);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }


    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    public void compare(Ravenclaw other) {
        var sum = mind + wisdom + wit + creative;
        var otherSum = other.mind + other.wisdom + other.wit + other.creative;
        if (sum > otherSum) {
            System.out.println(this.getStudent() + " лучший Когтевранец, чем " + other.getStudent());
        } else {
            System.out.println(other.getStudent() + " лучший Когтевранец, чем " + this.getStudent());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creative == ravenclaw.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wisdom, wit, creative);
    }

    @Override
    public String toString() {
        return super.toString() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creative=" + creative;
    }
}
