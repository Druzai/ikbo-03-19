package ru.mirea.practika6;

public class Student implements Comparable<Student> {
    private int iDNumber = 0;
    private String Name = "Ivan";
    private int endScore = 0;

    Student(int iDNumber, String Name){
        this.iDNumber = iDNumber;
        this.Name = Name;
    }

    Student(String Name, int endScore){
        this.Name = Name;
        this.endScore = endScore;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getendScore(){
        return endScore;
    }

    public void setEndScore(int endScore) {
        this.endScore = endScore;
    }

    public String toString() {
        return "IDNumber: " + iDNumber + ", Name: " + Name + ", EndScore: " + endScore;
    }

    @Override
    public int compareTo(Student b) {
        return Integer.compare(this.getendScore(), b.getendScore());
    }

    public int compareTo(int b){
        return Integer.compare(this.getendScore(), b);
    }
}