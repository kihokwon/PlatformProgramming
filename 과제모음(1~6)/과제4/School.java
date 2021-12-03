import java.util.*;

public class School {
    private String name;
    private int limit;

    private Student[] students;
    private int studentCount;

    public School(String name, int limit){
        this.name = name;
        this.limit = limit;
        this.students = new Student[limit];
    }

    public String toString(){
        String msg = "School Name: " + name + " Student Count: "+ studentCount + "\n";
        for(int i = 0; i < studentCount; i++){
            msg += "\t" + students[i] + "\n";
        }
        return msg;
    }

    public void addStudent(Student newStudent){
        // Initializing Array Of Objects
        students[studentCount] = newStudent;
        studentCount++;
    }

    public Student findStudent(String name, int year){
        Student testStu = new Student(name, year);
        for(int i = 0; i < studentCount; i++){
            if(students[i].equals(testStu))
                return students[i];
        }
        return null;
    }

    public void removeAllStudent(){
        students = new Student[limit];
        studentCount = 0;
    }

    // equals(), hashcode()
}
