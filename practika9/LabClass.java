package ru.mirea.practika9;

import java.util.ArrayList;

public class LabClass {
    private final ArrayList<Student> University;
    Student findStudent = null;

    public LabClass() {
        this.University = new ArrayList<>();
    }

    public void addStudent(Student student) {
        University.add(student);
        University.sort(Student::compareTo);
    }

    public Student findStudent(String name, int GPA) throws StudentNotFoundException {
        for (Student student : University) {
            if (student.getName().equals(name) && student.getGPA() == GPA)
                findStudent = student;
        }
        if (findStudent == null)
            throw new StudentNotFoundException("Студент " + name + " с номером " + GPA + " не найден");
        else
            return findStudent;
    }

    public Student remove() {
        return University.remove(0);
    }

    public boolean isEmpty() {
        return University.isEmpty();
    }
}
