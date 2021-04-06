package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LuckBalance {
    public static void main(String[] args) {
        int x=luckBalance(3,new int[][]{
                {5,1},{2,1},{1,1},{8,1},{10,0},{5,0}
        });
        System.out.println(x);
    }

    static int luckBalance(int k, int[][] contests) {
        int res=0;
        int j=0;
        int n=contests.length;
        ArrayList<Integer> count=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(contests[i][1]==0){
                res+=contests[i][0];
            }else{
                count.add(contests[i][0]);
            }
        }
        Collections.sort(count,Collections.reverseOrder());
        System.out.println(res+" "+count);
        int x=0;
        for(int i=0;i<count.size();i++){
            if(x<k){
                res+=count.get(i);
                x++;
            }else{
                res-=count.get(i);
            }
        }
        return res;
    }
}
