package org.launchcode.java.school;

import java.util.ArrayList;

public class Course {

    public static String title;
    public String instructor;
    public static int creditHours;
    public ArrayList<Student> enrolledStudents;


    public Course(String title, String instructor, int creditHours) {
        this.title = title;
        this.instructor = instructor;
        this.creditHours = creditHours;
        this.enrolledStudents = new ArrayList<Student>();
    }

    public String getTitle() {
        return title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getInstructor() {
        return instructor;
    }

    private void setInstructor(String anInstructor) {
        instructor = anInstructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    private void setEnrolledStudents(Student student) {
        enrolledStudents.add(student);
    }
}
