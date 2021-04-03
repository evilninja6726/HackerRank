package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockHolmesAndAnagram {
    public static void main(String[] args) {
        anagramPair("cdcd");
    }

    public static void anagramPair(String s){
        int res=0;
        HashMap<String, Integer> hashMap=new HashMap<>();
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                //System.out.println(s.substring(i,j));
                char[] arr=s.substring(i,j).toCharArray();
                Arrays.sort(arr);
                String temp=new String(arr);
                hashMap.put(temp,hashMap.getOrDefault(temp,0)+1);
            }
        }
        for (Map.Entry<String, Integer> entry:hashMap.entrySet()){
            res+=((entry.getValue()-1)*(entry.getValue()))/2;
        }
        System.out.println(hashMap);
        System.out.println(res);
    }
}
