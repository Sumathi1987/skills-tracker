package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setName (String aName) {

        this.name = aName;

    }

    public void setStudentId (int aStudentId) {

        this.studentId = aStudentId;

    }

    public void setCredits (int aCredit) {

        this.numberOfCredits = aCredit;

    }

    public void setGPA (double aGPA) {

        this.gpa = aGPA;

    }

    public String getName () {

        return this.name;

    }

    public int getStudentId () {

        return this.studentId;

    }

    public int getCredits () {

        return this.numberOfCredits;

    }

    public double getGPA () {

        return this.gpa;

    }

}