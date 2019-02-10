package com.Alevel.homeWorks.lesson13.Back2School;

public class Student extends Person{
    private double gradePointAverage;
    private String studentID;

   public Student ( String name, int age, String gender, double gradePointAverage, String studentID ){
       super(name, age, gender);
       this.gradePointAverage = gradePointAverage;
       this.studentID = studentID;
   }

    public void setGradePointAverage(double gradePointAverage) {

       this.gradePointAverage = gradePointAverage;
    }

    public void setStudentID(String studentID) {

       this.studentID = studentID;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", gpa" + gradePointAverage +
                ", student ID:" + studentID;
    }
}
