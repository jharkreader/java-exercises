package org.launchcode.java.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;


    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentID() {
        return studentId;
    }

    private void setStudentID(int aStudentID) {
        studentId = aStudentID;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public void addGrade(int courseCredits, double grade) {

        double totalQualityScore = this.getGpa() * this.getNumberOfCredits();
        totalQualityScore += grade;
        int newNumberOfCredits = this.getNumberOfCredits() + courseCredits;
        this.setNumberOfCredits(newNumberOfCredits);
        double newGpa = totalQualityScore / this.getNumberOfCredits();
        this.setGpa(newGpa);

    }

    public String getGradeLevel() {

        String gradeLevel = "Freshman";
        int currentCredits = this.getNumberOfCredits();

        if (currentCredits > 29) {
            gradeLevel = "Sophomore";
        }
        if (currentCredits > 59) {
            gradeLevel = "Junior";
        }
        if (currentCredits > 89) {
            gradeLevel = "Senior";
        }

        return gradeLevel;

    }

    @Override
    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentID() == getStudentID();
    }

}