package ua.edu.ucu.apps.task1;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

@ToString
@Builder
@Getter
public class Student {
    
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular private List<String> courses;

    // public Student() {
        
    // }

    // public static class StudentBuilder {

    //     private Student student;

    //     public StudentBuilder() {
    //         this.student = new Student();
    //     }

    //     public StudentBuilder firstName(String firstName) {
    //         student.firstName = firstName;
    //         return this;
    //     }

    //     public StudentBuilder lastName(String lastName) {
    //         student.lastName = lastName;
    //         return this;
    //     }

    //     public StudentBuilder age(int age) {
    //         student.age = age;
    //         return this;
    //     }

    //     public Student build() {
    //         return student;
    //     }
    // }

}
