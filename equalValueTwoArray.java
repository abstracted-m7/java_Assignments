

import java.util.*;
public class equalValueTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number : ");
        int num=sc.nextInt();
        int arr1[] = new int[num];
        int arr2[] = new int[num];
        int i;

        // ---> User inputs for first array.
        System.out.println("\nPut the value for first array : ");
        for(i=0;i<num;i++){
            System.out.printf("Enter the %d'th index value : ",i);
            arr1[i]=sc.nextInt();
        }

        //---> Printing the first array.
        System.out.print("\nThe first array is : [");
        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+",");
        }System.out.println("]");

        // ---> User inputs for second array.
        System.out.println("\nPut the value for second array : ");
        for(i=0;i<num;i++){
            System.out.printf("enter the %d'th index value : ",i);
            arr2[i]=sc.nextInt();
        }
        //---> printing the second array.
        System.out.print("\nThe second array is : [");
        for(i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+",");
        }System.out.println("]");
        
        // ---> Apply check condition using -- Arrays.equals -- mathod
            boolean equal = Arrays.equals(arr1,arr2);

        //---> Check those two array are equal or not.
        if (equal) {
            System.out.println("Those two array are equal.");
        }
        else {
            System.out.println("Those two array are not equal.");
        }
    }
}

