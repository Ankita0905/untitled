package com.lambton;

import java.time.LocalDate;

public class Faculty extends Person
{
    private String designation;
    private Float salary;
    private String specialisation;

    public Faculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String designation, Float salary, String specialisation) {
        super(id, firstName, lastName, birthDate, gender);
        this.designation = designation;
        this.salary = salary;
        this.specialisation = specialisation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public void display()
    {
        System.out.println("Faculty Id:" + getId());
        System.out.println("Faculty First name:" + getFirstName());
        System.out.println("Faculty Last name:" + getLastName());
        System.out.println("Faculty Birth Date:" + getBirthDate());
        System.out.println("Faculty Gender" + getGender());
        System.out.println("Faculty Designation:" + getDesignation());
        System.out.println("Faculty Salary:" + getSalary());
        System.out.println("Faculty Specialisation:" + getSpecialisation());
    }
}
