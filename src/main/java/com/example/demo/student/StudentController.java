package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Example-Header","Value-Example-Header");
        responseHeaders.set("Example-Header2","Value2-Example-Header");

        return ResponseEntity.ok().headers(responseHeaders).body(studentService.getStudents());
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable Integer studentId) {
        return studentService.getStudent(studentId);
    }
    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudents(student);
    }
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudents(studentId);
    }

}

