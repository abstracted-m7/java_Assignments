/*write a java program to interchange arr[0]=arr[n-1],arr[1]=arr[n-2] from a array. */


import java.util.*;
/**
 * numberAulter
 */
public class numberAlter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of numbers : ");
        int num = sc.nextInt();
        int arr[]=new int[num];
        int temp[]=new int[arr.length];
        int i;
        //user input
        for(i=0;i<arr.length;i++){
            System.out.printf("Enter %d'th index value : ",i);
            arr[i]=sc.nextInt();
        }
        //print the array 
        System.out.println("The array : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //copy elements into temp array
        for(i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        // Inter change the positions
        for(i=0;i<arr.length;i++){
            arr[i]=temp[arr.length-1-i];
        }
        //print that array
        System.out.println("\nInterchange array : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}