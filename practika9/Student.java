package ru.mirea.practika9;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private final int GPA;
    private final String name;

    public Student(int GPA, String name) {
        this.GPA = GPA;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student obj) {
        return Integer.compare(this.GPA, obj.GPA);
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                ", name='" + name + '\'' +
                '}';
    }
}