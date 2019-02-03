package com.Alevel.homeWorks;

import java.util.Arrays;

public class LoopTasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MaxAndMin(0, 9, 1, 3, 14, 16, 7)));
        findMinMAx(1, 3, 5, 7, 2, 4, 6, 9, 14, 15, 67, 23);
        System.out.println(Arrays.toString(changeNumbs(0,0,1,1,0,1,1,0,1,1,0)));
        System.out.println(Arrays.toString(someNumversChange(1,2,3,-5,7,13,-15,17,-29,-56,-75)));
        System.out.println((compareMultiple(-1, 4, 2 ,-5, -9, 7, -11, 6)));
        System.out.println(Arrays.toString(insertNumber(3 ,1,2,3,5,7,9,11,13)));
    }

    public static int[] MaxAndMin(int... nums) {
        int max = nums[0];
        int min = nums[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                maxIndex = i;
            }
        }
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[minIndex];
        nums[minIndex] = temp;


        return nums;
    }

    public static void findMinMAx(int... nums) {
        int min = nums[1];
        int max = nums[2];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i + 1] > max) {
                max = nums[i + 1];
            }
        }
        System.out.println(min + " is minimal value of odd index elements");
        System.out.println(max + " is maximum value of even index elements");
    }

    public static int [] changeNumbs(int... numers) {

int temp = 0;
        for (int i = 0; i < numers.length; i++) {
           for(int j = 1; j < numers.length-i; j++){
               if(numers[j-1] > numers[j]){
                   temp = numers[j-1];
                   numers[j-1] = numers[j];
                   numers[j] = temp;
               }
           }
        }
        return numers;
    }
    public static int [] someNumversChange(int ... nums){
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(max < Math.abs(nums[j])){
                nums[j] = 0;
            }
        }
        return nums;
    }
    public static int compareMultiple (int...nums){
        int negativeM = 1;
        int positiveM = 1;
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                negativeM*=nums[i];
            }
            if(nums[i] > 0){
                positiveM*=nums[i];
            }
        }
for(int j = 0; j < nums.length; j++) {
    if (Math.abs(negativeM) > Math.abs(positiveM)) {
        result = negativeM;
    } else result = positiveM;
}

        return result;
    }


    public static int [] insertNumber (int b, int ... nums){
        for(int i = 0; i < nums.length-1; i++){
            if(b >= nums[i] && b <= nums[i+1]){
                nums[i+1] = b;
                break;
            }
        }
        return nums;
    }
}
