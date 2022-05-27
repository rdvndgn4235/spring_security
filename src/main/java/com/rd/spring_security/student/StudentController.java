package com.rd.spring_security.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created at 26.05.2022.
 *
 * @author Ridvan Dogan
 */
@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Ahmet Şahin"),
            new Student(2, "Rıfat Kellerin"),
            new Student(3, "Taner Kaya")
    );

    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable Integer studentId) {
        return STUDENTS.stream()
                .filter(student -> student.getId().equals(studentId))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentId + " not found"));
    }
}
