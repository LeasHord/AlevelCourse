package com.Alevel.homeWorks;


public class Multiple1 {
    public static void main(String[] args) {

        int i = 25;
        int j = 25;
        System.out.println(multiple(i,j));

    }

    public static int multiple(int x, int y) {
        int result;

        if (y == 0) {
            return 0;
        }
        result = multiple(x, y/2);
        if(y%2==0){
            return result*2;
        } else return x+(result*2);

    }

}

