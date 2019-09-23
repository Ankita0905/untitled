package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person
{
   private String courseName;
  private int currentSemester;



    public Student(int id, String firstName, String lastName, LocalDate birthDate, String gender, String courseName, int currentSemester)
    {
        super(id, firstName, lastName, birthDate, gender);
        this.courseName = courseName;
        this.currentSemester = currentSemester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    @Override
    public void display()
    {
        System.out.println("Student Id:" + getId());
        System.out.println("Student First name:" + getFirstName());
        System.out.println("Student Last name:" + getLastName());
        System.out.println("Student Birth Date:" + getBirthDate());
        System.out.println("Student Gender" + getGender());
        System.out.println("Student Course name:" + getCourseName());
        System.out.println("Student Current Semester:" + getCurrentSemester());
    }
}
