import java.util.Objects;

public class Hogwarts {
    private String student;
    private int magic;
    private int transgression;
    private String faculty;

    public Hogwarts(String student, int magic, int transgression, String faculty) {
        this.student = student;
        this.magic = magic;
        this.transgression = transgression;
        this.faculty = faculty;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void compare(Hogwarts other) {
        if (this.getMagic() > other.getMagic()){
            System.out.println(this.student + " обладает большей мощностью магии, чем " + other.student);
        } else {
            System.out.println(other.student + " обладает большей мощностью магии, чем " + this.student);
        }
        if (this.getTransgression() > other.getTransgression()) {
            System.out.println(this.student + " обладает большей дистанцией, чем " + other.student);
        } else {
            System.out.println(other.student + " обладает большей дистанцией, чем " + this.student);
        }
        }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magic == hogwarts.magic && transgression == hogwarts.transgression && Objects.equals(student, hogwarts.student) && Objects.equals(faculty, hogwarts.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, magic, transgression, faculty);
    }

    @Override
    public String toString() {
        return "Hogwarts " +
                "student ='" + student + '\'' +
                ", magic =" + magic +
                ", transgression =" + transgression +
                ", faculty ='" + faculty + '\'' + ",";
    }
}


