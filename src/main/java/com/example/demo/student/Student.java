package com.example.demo.student;

import org.springframework.beans.factory.annotation.Required;

import java.time.LocalDate;
import javax.validation.constraints.*;

public class Student {
    public Long id;

    @Pattern(regexp="^[A-Z]{1,3}[a-z]*[1-9]{1,5}$")
    private String name;
    @NotBlank
    @Email
    private String email;
    private LocalDate dob;
    @NotBlank
    @Min(1)
    @Max(110)
    private Integer age;

    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
