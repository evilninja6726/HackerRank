package com.company;

public class SpecialStringAgain {
    public static void main(String[] args) {
        System.out.println(specialString("abcbaba", 7));
    }

    public static int specialString(String s, int n) {
        int res = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i]++;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i]++;
            }
        }

        for (int i = 0; i < n; i++) {
            res++;

            if (i > 0 && i < n - 1) {
                if (s.charAt(i - 1) == s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1)) {
                    res += Math.min(left[i - 1], right[i + 1]);
                } else if (s.charAt(i) == s.charAt(i - 1)) {
                    res += left[i] - 1;
                }
            } else if (i == n - 1 && s.charAt(i - 1) == s.charAt(i)) {
                res += left[i] - 1;
            }
        }
        return res;
    }
}
