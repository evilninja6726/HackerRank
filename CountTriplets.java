package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountTriplets {
    public static void main(String[] args) {
        List<Long> longs = Collections.EMPTY_LIST;
        Collections.addAll(longs = new ArrayList<>(), 1l, 4l, 4l, 16l, 64l);
        System.out.println(countTriplet(new int[]{1, 4, 4, 16, 64}, 4));
        System.out.println(countTriplets(longs, 4));
    }

    public static int countTriplet(int[] arr, long r) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i] * r) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[k] == arr[j] * r)
                            c++;
                    }
                }
            }
        }
        return c;
    }

    public static long countTriplets(List<Long> arr, long r) {
        long res = 0;
        HashMap<Long, Long> leftMap = new HashMap<>();
        HashMap<Long, Long> rightMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            rightMap.put(arr.get(i), rightMap.getOrDefault(arr.get(i), 0l) + 1);
        }

        for (int i = 0; i < arr.size(); i++) {
            long a = arr.get(i);
            long left = 0l, right = 0l;
            rightMap.put(a, rightMap.getOrDefault(a, 0l) - 1);
            if (leftMap.containsKey(a / r) && a % r == 0)
                left = leftMap.get(a / r);
            if (rightMap.containsKey(a * r))
                right = rightMap.get(a * r);

            res += left * right;
            leftMap.put(a, leftMap.getOrDefault(a, 0l) + 1);
        }
        return res;
    }
}
