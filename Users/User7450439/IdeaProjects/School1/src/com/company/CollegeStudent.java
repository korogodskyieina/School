package com.company;

import static java.lang.System.*;

public class CollegeStudent extends Student {
    private int Year;
        int [] yea = {1,2,3,4,5};
    private String Major;
        String [] Maj = {"Languages", "Engineering", "Undeclared"};

    public CollegeStudent(int Age, String Name, String Gender, String idNumber, double gpa, int Year, String Major) {
        super(Age, Name, Gender, idNumber, gpa);
        this.Year = Year;
        this.Major = Major;
    }

    public int getYear() {
        return Year;
    }

    public void setYear() {
        this.Year = Year;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor() {
        this.Major = Major;
    }

    @Override
    public String toString() {
        return super.toString() + " Year " + Year + " Major " + Major;
    }
}
