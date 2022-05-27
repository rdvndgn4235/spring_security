package com.rd.spring_security.student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created at 27.05.2022.
 *
 * @author Ridvan Dogan
 */
@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Ahmet Şahin"),
            new Student(2, "Rıfat Kellerin"),
            new Student(3, "Taner Kaya")
    );

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'ADMIN_TRAINEE')")
    public List<Student> getStudents(){
        return STUDENTS;
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN')")
    public void registerStudent(@RequestBody Student newStudent){
        System.out.println(newStudent);
    }

    @DeleteMapping("{studentId}")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println(studentId);
    }

    @PutMapping("{studentId}")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody Student student){
        System.out.printf("%s %s", studentId, student);
    }
}
