package Sorting;

import java.util.*;
public class bubbleShort {
    public static void main(String[] args) {
        int arr[]={8,5,1,6,7,25};
        int n=arr.length;
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
