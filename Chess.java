package com.Alevel.lesson4.homeWork;

public class Chess {
    public static void main(String[] args) {
        System.out.println(chess(2,1, 4, 3));

    }
    public static boolean chess ( int x_position, int y_position, int nextStep1, int nextStep2){
                boolean step = false;
                int step1 = 2;
                int step2 = 1;

                if(x_position+step1 == nextStep1 ^ x_position + step2 == nextStep1 && y_position+step1 == nextStep2 ^ y_position + step2 == nextStep2){
                   step = true;
               }


return step;
    }
}
