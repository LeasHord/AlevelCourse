package com.Alevel;

public class TriangleSquare {
    public static void main(String[] args) {
        System.out.println(trianglesSquare(2, 5, 6));
    }

    public static double trianglesSquare(int a, int b, int c) {
        double hP = (double)(a + b + c) / 2.0D;
        double square = Math.sqrt(hP * (hP - (double)a) * (hP - (double)b) * (hP - (double)c));
        return square;
    }
}
