package com.company;

public class Main {

    public static void main(String[] args) {
       
	Student InfoStudent = new Student("Vasiltsova", "Natalia", "PKS-419", "Yes");
        InfoStudent.getStudentF();
        InfoStudent.getStudentI();
        InfoStudent.getStudentG();
        InfoStudent.getStudentWork();

        InfoStudent.getScholarship(5);
        InfoStudent.getScholarship(4.9);
    }
}
