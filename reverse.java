/* Write a java program to copy the contant of an array to another array in reverse order */
import java.util.*;
/**
 * reverse
 */
public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number : ");
        int num = sc.nextInt();
        int arr[]=new int[num];
        int copyArr[] = new int[arr.length];
        int i;

        // for user input
        for(i=0;i<num;i++){
            System.out.printf("Enter the %d'th index value : ",i);
            arr[i]=sc.nextInt();
        }
        // Print the first array
        System.out.print("\nThe final array is : [ ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println("]");

        //Copy elements from first array to copyArr
        for(i=0;i<arr.length;i++){
            copyArr[i]=arr[i];
        }
        // Print the copyArr
        System.out.print("\nThe CopyArr array is : [ ");
        for(i=0;i<copyArr.length;i++){
            System.out.print(copyArr[i]+" ");
        }System.out.println("]");

        // Print in reverse form
        System.out.print("\nThe copyArr in reverse order is : [ ");
        for(i=copyArr.length-1;i>=0;i--){
            System.out.print(copyArr[i]+" ");
        }System.out.println("]");
    }
}