
import java.util.*;
public class numberFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number : ");
        int num = sc.nextInt();
        int smallValue = Integer.MAX_VALUE;
        int greaterValue = Integer.MIN_VALUE;
        int arr[]=new int[num];
        int i;

        // ---> Input users value.
        for(i=0;i<num;i++){
            System.out.printf("Enter the %d'th index value : ",i);
            arr[i]=sc.nextInt();
        }

        // ---> Find Max value.
        for(i=0;i<arr.length;i++){
            if (greaterValue<arr[i]) {
                greaterValue=arr[i];
            }
        }

        // ---> Find Min value.
        for(i=0;i<arr.length;i++){
            if(smallValue>arr[i]){
                smallValue=arr[i];
            }
        }

        // ---> Printing the final array.
        System.out.print("The final array is : [ ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }System.out.println("]");
        
        // ---> Printing the Smallest value.
        System.out.println("The smallest value is : "+smallValue);

        // ---> Printing the Greatest value.
        System.out.println("The Greatest vakue is : "+greaterValue);
    }
}
