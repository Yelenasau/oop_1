import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String student, int magic, int transgression, String faculty, int nobility, int honor, int bravery) {
        super(student, magic, transgression, faculty);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compare(Gryffindor other) {
        var sum = nobility + honor + bravery;
        var otherSum = other.nobility + other.honor + other.bravery;
        if (sum > otherSum) {
            System.out.println(this.getStudent() + " лучший Гриффендорец, чем " + other.getStudent());
        } else {
            System.out.println(other.getStudent() + " лучший Гриффендорец, чем " + this.getStudent());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}