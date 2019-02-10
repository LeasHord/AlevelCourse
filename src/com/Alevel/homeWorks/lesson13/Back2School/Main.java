package com.Alevel.homeWorks.lesson13.Back2School;

public class Main {
    public static void main(String[] args) {


        Teacher firstTeacher = new Teacher("Mariia Ivanovna", 25, "Female", "Biology", 240);
        Teacher secondTeacher = new Teacher("Vasil Nikonorovich", 55, "male", "Philosophy", 200);
        Student firstStudent = new Student("Masha", 18,"female", 4.5, "HS1234567" );
        Student secondStudent = new Student("Artem", 19, "male", 7, "PO0987654");
        CollegeStudent lucky = new CollegeStudent("Petya", 21, "male", "GH6574839", 8.3, 2, "Architecture and Desighn");
        CollegeStudent newGirl = new CollegeStudent("Alina", 20, "female", "KN6391720", 9, 1, "Linguistics");
        Person someHuman = new Person("Larry Mattew", 22, "male");
        Person someNewTeacher = new Person("Katy", 28, "female");

        Person[] persons = {firstTeacher,secondTeacher, firstStudent, secondStudent, lucky, newGirl, someHuman, someNewTeacher};
        for(Person somebody : persons){
            System.out.println(somebody);
        }

    }
}
