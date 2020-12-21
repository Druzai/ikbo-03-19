package ru.mirea.practika9;

import java.util.Scanner;

public class LabClassDriver {
    LabClass labClass;

    public LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void create() {
        String name = "";
        int GPA = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество студентов - ");
        if (sc.hasNextInt())
            i = sc.nextInt();
        for (int j = 0; j < i; j++) {
            System.out.println("Введите имя и оценку студента:");
            if (sc.hasNext())
                name = (sc.next()).toLowerCase();
            if (sc.hasNextInt())
                GPA = sc.nextInt();
            labClass.addStudent(new Student(GPA, name));
        }
    }
}