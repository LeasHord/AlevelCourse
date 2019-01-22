package com.Alevel.lesson4.homeWork;

public class TriangleSquare {
    public static void main(String[] args) {
        System.out.println(trianglesSquare(2,5,6));

    }
    public static double trianglesSquare (int a, int b, int c){
        double hP = (double)(a+b+c)/2;
        double square = Math.sqrt(hP*(hP - a) * (hP - b) * (hP - c));


        return square;
    }
}
