package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return DAOstudent.getStudentList();
    }
    public void addStudents(Student student) {
        DAOstudent.addStudent(student);
    }

    public void deleteStudents(int id) {
        DAOstudent.deleteStudents(id);
    }

    public Student getStudent(int id) {
        return DAOstudent.getStudent(id);
    }

}


