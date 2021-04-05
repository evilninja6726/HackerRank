package com.company;

public class CommonChild {
    public static void main(String[] args) {
        System.out.println(commonChild("ABCD", "ABDC"));
    }

    static int commonChild(String s1, String s2) {
        int[][] C = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    C[i + 1][j + 1] = C[i][j] + 1;
                } else {
                    C[i + 1][j + 1] = Math.max(C[i + 1][j], C[i][j + 1]);
                }
            }
        }
        return C[s1.length()][s2.length()];
    }

}

