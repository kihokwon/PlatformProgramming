import java.util.*;

public class Student{
    private String name;
    private int year;

    public Student(String name, int year){
        this.name = name;
        this.year = year;

    }
    @Override
    public String toString() {
        return "[" + name + ", " + year + "학년]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year && Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
    // other methods including constructor
    // toString(), equals(), hashcode()
}

