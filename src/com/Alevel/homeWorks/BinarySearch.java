package com.Alevel.homeWorks;

public class BinarySearch {
    public static void main(String[] args) {
        int someArray [] = {0,1,2,3,4,5,9,13,15,98};
        int result = 0;
     for(int i = 0; i < someArray.length; i++)
        result = binarySearch(15, someArray, 0, someArray.length);

        System.out.println(result);
    }
    public static int binarySearch (int k, int[] array, int low, int high){
        int mid = (high+low)/2;

        if(high < low){
            return -1;
        }
        if(k == array[mid]){
            return mid;
        } else if(k < array[mid]){
            return binarySearch(k, array, low, mid-1);
        } else {
            return binarySearch(k, array, mid+1, high);
        }
    }
}
