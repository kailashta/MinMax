package com.company;
import java.util.*;
class Result {
    public void miniMaxSum(int arr[],int n){
        int min=arr[0],max=arr[0] ;
        for(int i = 1; i <n; i++){
            //finding minimum element
            if(min>arr[i]){
                min = arr[i];
            }
            //finding maximam element
            else if(max<arr[i]){
                max = arr[i];
            }
        }
        //sum of elements without min and max values
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            sum1 = sum1 + arr[i];
        }
        for(int i = 0;i<n;i++){

            sum2 = sum2 + arr[i];

        }
        sum1 = sum1-max;
        sum2 = sum2-min;
        System.out.println(min+ " "+max);
        System.out.println(sum1 + " "+sum2);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        int size = sc.nextInt();
        int a[] = new int[size];
        //reading array elements
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        r.miniMaxSum(a,size);
    }
}
