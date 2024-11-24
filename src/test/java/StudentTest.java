import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task1.Student;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class StudentTest {

    @Test
    void testStudentBuilder() {
        Student student = Student.builder()
                .firstName("Vlada")
                .lastName("Panchyshyn")
                .gender("female")
                .email("vp@example.com")
                .age(18)
                .course("OOP")
                .course("P&S")
                .build();

        assertEquals("Vlada", student.getFirstName());
        assertEquals("Panchyshyn", student.getLastName());
        assertEquals("female", student.getGender());
        assertEquals("vp@example.com", student.getEmail());
        assertEquals(18, student.getAge());
        assertEquals(Arrays.asList("OOP", "P&S"), student.getCourses());
    }

    @Test
    void testStudentToString() {
        Student student = Student.builder()
                .firstName("Alice")
                .lastName("Smith")
                .gender("female")
                .email("alice.smith@example.com")
                .age(22)
                .course("Biology")
                .course("Chemistry")
                .build();
        String expected = "Student(firstName=Alice, lastName=Smith, gender=female, email=alice.smith@example.com, age=22, courses=[Biology, Chemistry])";
        assertEquals(expected, student.toString());
    }

    @Test
    void testSingularCourses() {
        Student student = Student.builder()
                .firstName("Mike")
                .lastName("Johnson")
                .course("History")
                .course("Geography")
                .build();

        assertEquals(2, student.getCourses().size());
        assertTrue(student.getCourses().contains("History"));
        assertTrue(student.getCourses().contains("Geography"));
    }
}
