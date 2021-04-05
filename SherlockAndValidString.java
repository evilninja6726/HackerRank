package com.company;

import java.util.Arrays;

public class SherlockAndValidString {
    public static void main(String[] args) {
        System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
    }

    static String isValid(String s) {
        int[] arr = new int[26];
        int c2 = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(arr));
        int c1 = arr[0];
        int a = 1;
        int b = 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            if (arr[i] != c1) {
                c2 = arr[i];
                j = i;
                b++;
                break;
            }
            a++;
        }
        if (c2 == 0) {
            return "YES";
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            if (arr[i] == c1) {
                a++;
            } else if (arr[i] == c2) {
                b++;
            } else {
                return "NO";
            }
        }
        System.out.println(a + " " + b + " " + c1 + " " + c2);
        if ((a == 1) && Math.abs(c1 - c2) <= 1) {
            return "YES";
        } else if (b == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
