package com.company;

public class MinMax {
    public static void main(String[] args) {
        miniMaxSum(new int[]{793810624, 895642170, 685903712, 623789054, 468592370});
    }
    static void miniMaxSum(int[] arr) {
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
            // if(arr[i]>Integer.MAX_VALUE||arr[i]<Integer.MIN_VALUE){
            //     continue;
            // }
            if(min>sum-arr[i]){
                min=sum-arr[i];
            }
            if(max<sum-arr[i]){
                max=sum-arr[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
