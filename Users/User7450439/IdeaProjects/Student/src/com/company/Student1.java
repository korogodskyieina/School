package com.company;

import java.util.Iterator;

public class Student1 {
    static String StName;
    static int Course;

    public Student1(String StName, int Course) {
        this.StName = StName;
        this.Course = Course;
    }

    public String getStName() {
        return StName;
    }

    public void setStName(String stName) {
        StName = stName;
    }

    public int getCourse() {
        return Course;

    }

    public void setCourse(int course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Course " + Course + "StName " + StName;
    }

    public static Iterator<Student1> iterator() {
        return null;
    }

}
