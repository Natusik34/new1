package com.company;

public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, String group, String scientificWork){
        super(firstName, lastName, group, scientificWork);
    }
    @Override
    public void getScholarship(double averageMark) {
        if (averageMark == 5) {
            estimation = 20000;
            System.out.println(estimation);
        } else {
            estimation = 18000;
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
            System.out.println(scientificWork);
        }
}
