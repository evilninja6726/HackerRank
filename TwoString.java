package com.company;

import java.util.HashSet;

public class TwoString {
    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "hi"));
    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashSet<Character> h = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            h.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            if (h.contains(s2.charAt(i))) {
                return "YES";
            }
        }
        return "NO";
    }

}
