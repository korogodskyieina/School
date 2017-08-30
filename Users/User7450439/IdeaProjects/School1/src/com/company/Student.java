package com.company;

public class Student extends Person {
    private String idNumber;
        String [] ID = {"HS5123", "HS5124", "HS5125"};
    private double gpa;
        double [] gp = {3.25, 5.46, 8.99};

    public Student(int Age, String Name, String Gender, String idNumber, double gpa) {
        super(Age, Name, Gender);
        this.idNumber = idNumber;
        this.gpa = gpa;

    }




    public String getIdNumber(){
            return idNumber;
        }
    public void setIdNumber(){
        this.idNumber = idNumber;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(){
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " idNumber " + idNumber + " gpa " + gpa;
    }
}




