package com.company;

public class Student {

    public String firstName, lastName, group, scientificWork;
    public double averageMark, estimation;

    Student(){}
    Student(String firstName, String lastName, String group, String scientificWork){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.scientificWork = scientificWork;
    }

    public void getScholarship(double averageMark){
        if (averageMark == 5){
            estimation = 10000;
            System.out.println(estimation);
        } else {
            estimation = 8000;
            System.out.println(estimation);
        }

    }

    public void getStudentF() {
        System.out.println(firstName);
    }
    void getStudentI(){
        System.out.println(lastName);
    }
    void getStudentG(){
        System.out.println(group);
    }
    void getStudentWork(){
        System.out.println("No scientificWork!!!!!!!");
    }
}
