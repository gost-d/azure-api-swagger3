package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

public class DAOstudent {

    public static List<Student> studentsList;

    public DAOstudent() {
        this.studentsList = new ArrayList();
    }

    public static List<Student> getStudentList(){
        return studentsList;
    }

    public static void addStudent(Student student) {
        studentsList.add(student);
    }

    public static void deleteStudents(int id) {
        studentsList.remove(studentsList.stream()
                .filter(student -> student.getId() == id)
                .findAny()
                .orElse(null));
    }

    public static Student getStudent(int id) {
        return studentsList.stream()
                .filter(student -> student.getId() == id)
                .findAny()
                .orElse(null);
    }


}
