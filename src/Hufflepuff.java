import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String student, int magic, int transgression, String faculty, int industriousness, int loyalty, int honesty) {
        super(student, magic, transgression, faculty);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void compare(Hufflepuff other) {
        var sum = industriousness + loyalty + honesty;
        var otherSum = other.industriousness + other.loyalty + other.honesty;
        if (sum > otherSum) {
            System.out.println(this.getStudent() + " лучший Пуффендуец, чем " + other.getStudent());
        } else {
            System.out.println(other.getStudent() + " лучший Пуффендуец, чем " + this.getStudent());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honesty);
    }

    @Override
    public String toString() {
        return super.toString() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}
