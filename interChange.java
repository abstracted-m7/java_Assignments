/*Write a java program that inter changes the odd and even elements of an array.*/

import java.util.*;
/**
 * interChange
 */
public class interChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number : ");
        int num = sc.nextInt();
        int arr[]=new int[num];
        int odd[]=new int[arr.length];
        int even[]=new int[arr.length];
        int i;

        // user input 
        for(i=0;i<num;i++){
            System.out.printf("Enter %d'th index value : ",i);
            arr[i]=sc.nextInt();
        }

        //print the array
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //even & odd numbers find
        for(i=0;i<arr.length;i++){
            if (arr[i]%2==0) {
                even[i]=arr[i];
            }
            else{
                odd[i]=arr[i];
            }
        }
        // print the even array
        System.out.print("\nThe even array is : ");
        for(i=0;i<even.length;i++){
            if (even[i]==0) {
                continue;
            }else{
                System.out.print(even[i]+" ");
            }
        }
        // print the odd array
        System.out.print("\nThe odd number is : ");
        for(i=0;i<odd.length;i++){
            if(odd[i]==0){
                continue;
            }else{
                System.out.print(odd[i]+" ");
            }
        }

        //Inter change the array
        for (i = 0; i < arr.length - 1; i += 2) {
            if (i + 1 < arr.length) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.print("\nInter change the array is : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}