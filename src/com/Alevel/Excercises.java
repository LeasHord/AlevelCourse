package com.Alevel;

public class Excercises {
        public static void main(String[] args) {
            Swap(1, 0, 9, 7, 4, 5, 2, 13, 15, 17, 27);
            Columns(2, 3, 4, 5, 6, 12, 13, 14, 15, 16);
            Equivalence(3, 2, 13, 5, 7, 123, 15, 36, 1, 15, 17, 9, 8, 7, 10);
            System.out.println();
            Section(2, 8, 1, 3, 5, 6, 2, 4, 12, 13, 14, 15, 16);
            System.out.println();
            Multiple(5, 1, 3, 5, 7, 9, 15, 12, 6, 9, 7, 3);
        }

        public static void Swap(int... array) {
            int min = 0;
            int max = 0;
            int[] arr = new int[array.length];

            for(int i = 1; i < arr.length; ++i) {
                arr[i] = array[i];
                if (arr[i] > arr[i - 1]) {
                    max = arr[i];
                } else {
                    min = arr[i];
                }
            }

            System.out.println(min);
            System.out.println(max);
        }

        public static void Columns(int... arr) {
            int mid = arr.length / 2;

            for(int i = 0; i < mid; ++i) {

                System.out.println(arr[i + mid]);
            }

        }

        public static void Equivalence(int val, int add, int... array) {
            int min = val - add;
            int max = val + add;
            int count = 0;

            for(int i = 0; i < array.length; ++i) {
                if (array[i] != val && array[i] != min && array[i] != max) {
                    ++count;
                }
            }

            System.out.print(count);
        }

        public static void Section(int c, int d, int... numbers) {
            for(int i = c; i <= d; ++i) {
                System.out.print(numbers[i]);
            }

        }

        public static void Multiple(int m, int... numbs) {
            int res = 1;

            for(int i = 0; i < numbs.length; ++i) {
                if (numbs[i] > m) {
                    res *= numbs[i];
                }
            }

            System.out.print(res);
        }
    }


