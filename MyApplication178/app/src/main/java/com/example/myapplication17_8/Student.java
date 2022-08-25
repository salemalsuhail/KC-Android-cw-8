package com.example.myapplication17_8;

public class Student {
    private String StudentName;
    private int StudentAge;
    private int StudentPhoto;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }

    public int getStudentPhoto() {
        return StudentPhoto;
    }

    public void setStudentPhoto(int studentPhoto) {
        StudentPhoto = studentPhoto;
    }

    public Student(String studentName, int studentAge, int studentPhoto) {
      this.StudentName = studentName;
        this.StudentAge = studentAge;
        this.StudentPhoto = studentPhoto;
    }
}


