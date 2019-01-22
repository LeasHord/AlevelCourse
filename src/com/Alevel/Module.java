package com.Alevel;

public class Module {
    public static void main(String[] args) {
        System.out.print(singleNumbers(1, 3, 5, 1, 3, 2, 7, 8, 9, 0, 2));
        System.out.println();
    }

    public static int singleNumbers(int... nums) {
        int count = 0;

        for(int i = 0; i < nums.length; ++i) {
            int repeat = 0;

            for(int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) {
                    ++repeat;
                }
            }

            if (repeat == 0) {
                ++count;
            }
        }

        return count;
    }
}

