package ru.mirea.practika9;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LabClassUI {
    LabClass labClass;

    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver driver = new LabClassDriver(labClass);
        driver.create();
    }

    public void find(){
        Scanner sc = new Scanner(System.in);
        String[] a = {"Введите имя студента, которого хотите найти:", "Введите номер (больше или равного 0), которого хотите найти:"};
        String name = "";
        int GPA = -1;
        for (int u = 0; u < 2; u++) {
            System.out.println(a[u]);
            try {
                if (u == 0) {
                    if (sc.hasNext())
                        name = (sc.next()).toLowerCase();
                    if (name.isEmpty()) {
                        throw new EmptyStringException("Была введена пустая строка!");
                    }
                }
                else {
                    if (sc.hasNextInt())
                        GPA = sc.nextInt();
                    if (GPA == -1)
                        throw new EmptyStringException("Была введена неправильная строка с числом");
                }
            } catch (EmptyStringException e) {
                System.err.println(e.getMessage());
                System.out.println();
                find();
                return;
            }
        }
        try {
            System.out.println(labClass.findStudent(name, GPA).toString());
        } catch (StudentNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        LabClassUI run = new LabClassUI();
        run.find();
    }
}