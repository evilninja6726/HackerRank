package com.company;

import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {
        System.out.println(candies(new int[]{2, 4, 2, 6, 1, 7, 8, 9, 2, 1}));
        ;
    }

    public static long candies(int[] arr) {
        long res = 0;
        int[] t1 = new int[arr.length];
        Arrays.fill(t1, 1);
        int[] t2 = new int[arr.length];
        Arrays.fill(t2, 1);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                t1[i] = t1[i - 1] + 1;
            }
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                t2[i] = t2[i + 1] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            res += Math.max(t1[i], t2[i]);
        }
        return res;
    }
}
