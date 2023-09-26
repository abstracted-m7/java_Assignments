package Arrays;
import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        int arr[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        int sum[][]=new int[n][n];
        int arrlen=arr.length;
        int i,j;

        // user input for array1
        System.out.println("Enter the elements of array 1 : ");
        for(i=0;i<arrlen;i++){
            for(j=0;j<arrlen;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // print the array1
        System.out.println("The first array is : ");
        for(i=0;i<arrlen;i++){
            for(j=0;j<arrlen;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // user input for array2
        System.out.println("Enter the elements of array 2 : ");
        for(i=0;i<arrlen;i++){
            for(j=0;j<arrlen;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        //print the second array
        System.out.println("The second array is: ");
        for(i=0;i<arrlen;i++){
            for(j=0;j<arrlen;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        // for sum
        for(i=0;i<arrlen;i++){
            for(j=0;j<arrlen;j++){
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum array : ");
        for(i=0;i<arrlen;i++){
            for(j=0;j<arrlen;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

