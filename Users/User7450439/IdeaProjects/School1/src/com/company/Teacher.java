package com.company;

import java.util.Arrays;

public class Teacher extends Person {
    private double Salary;


        double[] Salar = {10000.00, 20000.00, 30000.00};


    private String Subject;
        String [] Subj = {"Math", "English", "Chemistry"};



    public Teacher(int Age, String Name, String Gender, double Salary, String Subject) {
        super(Age, Name, Gender);
        this.Salary = Salary;
        this.Subject = Subject;
    }


    public double getSalary(){
        return Salary;
    }
    public void setSalary(){
        this.Salary = Salary;
    }
    public String Subject(){
        return Subject;
    }
    public void setSubject(){
        this.Subject = Subject;
    }

    @Override
    public String toString() {
        return super.toString() + " Salary " + Salary + " Subject " + Subject;
    }
}