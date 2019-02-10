package com.Alevel.homeWorks.lesson13.Back2School;

public class CollegeStudent extends Student {
    private int year;
    private String average;

   // CollegeStudent student1 = new CollegeStudent(3.1,"HS3459837", 2, "Ingeneering" );
    //CollegeStudent student2 = new CollegeStudent(5.5, "MQ8762123", 1, "Building");
    //CollegeStudent student3 = new CollegeStudent(9, "PO0987467", 3,"Architecture");
    //CollegeStudent student4 = new CollegeStudent(8.3, "NM8675643", 4, "Consulting");


    public CollegeStudent ( String name, int age, String gender, String studentID, double gradePointAverage,  int year, String average){
       super(name,age,gender,gradePointAverage,studentID);
       this.average = average;
       this.year = year;
   }

    public void setAverage(String average) {
        this.average = average;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAverage() {
        return average;
    }


    @Override
    public String toString() {
        return  super.toString() +
                ", year:" + year +
                ", major: " + average;
    }
}
