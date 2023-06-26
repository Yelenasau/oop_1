import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int trick;
    private int determinatin;
    private int ambition;
    private int resourcefulness;
    private int authoritativeness;

    public Slytherin(String student, int magic, int transgression, String faculty, int trick, int determinatin, int ambition, int resourcefulness, int authoritativeness) {
        super(student, magic, transgression, faculty);
        this.trick = trick;
        this.determinatin = determinatin;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authoritativeness = authoritativeness;
    }



    public int getTrick() {
        return trick;
    }

    public int getDeterminatin() {
        return determinatin;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthoritativeness() {
        return authoritativeness;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public void setDeterminatin(int determinatin) {
        this.determinatin = determinatin;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setAuthoritativeness(int authoritativeness) {
        this.authoritativeness = authoritativeness;
    }
    public void compare(Slytherin other) {
        var sum = trick + determinatin + ambition + resourcefulness + authoritativeness;
        var otherSum = other.trick + other.determinatin + other.ambition + other.resourcefulness + other.authoritativeness;
        if (sum > otherSum) {
            System.out.println(this.getStudent() + " лучший Слизеринец, чем " + other.getStudent());
        } else {
            System.out.println(other.getStudent() + " лучший Слизеринец, чем " + this.getStudent());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return trick == slytherin.trick && determinatin == slytherin.determinatin && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && authoritativeness == slytherin.authoritativeness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trick, determinatin, ambition, resourcefulness, authoritativeness);
    }

    @Override
    public String toString() {
        return super.toString() +
                "trick=" + trick +
                ", determinatin=" + determinatin +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", authoritativeness=" + authoritativeness ;
    }
}
