package com.example.jspdemo.data;

import com.example.jspdemo.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StudentDao {

    public static final Map<Integer, Student> students = new HashMap<>();
    static {
        students.put(1, new Student(1, "John", "Dillinger"));
        students.put(2, new Student(2, "Olivia", "Wild"));
        students.put(3, new Student(3, "Hugh", "Laurie"));
    }

    public Optional<Student> get(int id) {
        return Optional.of(students.get(id));
    }

    public List<Student> getAll() {
        return new ArrayList<>(students.values());
    }

    public static void create(String firstName, String lastName) {
        int nextId = students.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
        students.put(nextId, new Student(nextId, firstName, lastName));
    }
}
