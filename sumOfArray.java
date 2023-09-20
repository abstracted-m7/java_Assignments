
import java.util.*;
public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number : ");
        int num=sc.nextInt();
        int arr1[] = new int[num];
        int sum=0;
        int i;

        // ---> User inputs for array.
        for(i=0;i<num;i++){
            System.out.printf("Enter the %d'th index value : ",i);
            arr1[i]=sc.nextInt();
            sum=sum+arr1[i];
        }

        //---> Printing the array.
        System.out.print("The array is : [");
        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+",");
        }System.out.println("]");

        //---> Printing the result of sum.
        System.out.println("Sum of the array is : "+sum);
    }
}
