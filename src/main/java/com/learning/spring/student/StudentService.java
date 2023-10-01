package com.learning.spring.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private static List<Student> students = new ArrayList<>(Arrays.asList
            (
                    new Student("1", "Aarush", "13"),
                    new Student("2", "Akshara", "14"),
                    new Student("3", "Mayur", "15")
            ));

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void deleteStudent(String id) {
        students.removeIf(s -> s.getId().equals(id));
    }

    public static void updateStudent(String id, Student student) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getId().equals(id)) {
                students.set(i,student);
                return;
            }
        }
    }


    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(String id) {
        return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


}
