package com.company;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {

        System.out.println(arrayManipulation(10, new int[][]{{1, 5, 3}, {4, 8, 7}, {6, 9, 1}}));
    }

    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        for (int i = 0; i < queries.length; i++) {
            arr[queries[i][0] - 1] += queries[i][2];
            if (queries[i][1] <= n - 1) {
                arr[queries[i][1]] -= queries[i][2];
            }
        }
        long[] preSum = new long[n];
        preSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }
        long max = preSum[0];
        for (int i = 1; i < n; i++) {
            max = max < preSum[i] ? preSum[i] : max;
        }

        return max;
    }
}
