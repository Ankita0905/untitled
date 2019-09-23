package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class MainExample
{
    public static void main(String[] args)
    {
        Person p1;
        Student s1=new Student(1,
                "Ankita",
                "Jain",
                LocalDate.now(),
                "Female",
                "MADT",
                2);

        p1=s1;
        p1.display();

        Faculty f1=new Faculty(101,
                "Pretish",
                "patel",
                LocalDate.now(),
                "male",
                "Professor",
                (float) 1000.0,
                "Android Developer");
        p1=f1;
        p1.display();
    }
}
