package edu.pnu.admin;
import java.util.Objects;

public class Student {
    private String name;
    private int year;
    //private final School theSchool;

    public Student(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d학년]", name, year);
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
}