package com.company;

public abstract class Person{
    private int Age;
        int [] Ag = {18, 19, 25, 40, 65, 70};
    private String Name;
        String [] Nam = {"Vasiliy Petrov", "Semen Ivanov", "Sergey Kharin", "Nina Serdyukova", "Tatyana Kovaleva", "Yelena Khitrova"};

    private String Gender;
        String [] Gend = {"M", "F"};


    public Person (int Age, String Name, String Gender){
        this.Age = Age;
        this.Name = Name;
        this.Gender = Gender;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(){
        this.Age = Age;
    }
    public String getName(){
        return Name;
    }
    public void setName(){
        this.Name = Name;
    }
    public String getGender(){
        return Gender;

    }
    public void setGender(){
        this.Gender = Gender;
    }

    public String toString(){

        return "Name " + Name + " Age " + Age + " Gender " + Gender;
    }

}