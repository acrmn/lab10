package com.example;

public class Student {
    private String name;
    private int studentID;
    private int[] grades;

    public Student(String name, int studentID, int[] grades) {
        this.name = name;
        this.studentID = studentID;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void addGrade(int grade){
        int[] newGrades = new int[grades.length + 1];
        for (int i = 0; i < grades.length; i++) {
            newGrades[i] = grades[i];
        }
        newGrades[grades.length] = grade;
        grades = newGrades;
    }

    public int calculateAverage(){
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public char getGradeLetter(){
        int average = calculateAverage();
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }


}
