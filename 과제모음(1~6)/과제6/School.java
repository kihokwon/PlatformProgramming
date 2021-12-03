package edu.pnu.admin;
import edu.pnu.collection.GenericList;


public class School {
    private final String name;
    private GenericList<Student> students = new GenericList<Student>();
    // 원래는 여기다가 private Student[] students; 를 사용
    // int studentCount;
    // int limit

    public School(final String name, int limit){
        this.name = name;
        students.setData(limit);
    }
    public void addStudent(Student newStudent){
        students.setStudent(newStudent);
    }
    public Student findStudent(String name, int year){
        Student student = new Student(name, year);
        return (Student)students.getData(student);
    }

    public void removeAllStudent(){
        students.setDataNull();
    }

    @Override
    public String toString() {
        return String.format("School Name : %s Student Count: %d\n",
                name, students.getSize()) + students.toString();
    }
}
