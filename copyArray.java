
import java.util.*;
public class copyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number : ");
        int num = sc.nextInt();
        int arr[]=new int[num];
        int copyArray[]=new int[arr.length];
        int i;

        //---> User inputs for first array.
        for(i=0;i<num;i++){
            System.out.printf("Enter the %d'th index value : ",i);
            arr[i]=sc.nextInt();
        }

        //---> Printing First array.
        System.out.print("The first array is : [ ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }System.out.println("]");

        //---> Copy first array to copyArray.
        for(i=0;i<num;i++){
            copyArray[i]=arr[i];
        }

        //---> Printing the copyArray.
        System.out.print("The copyArray is : [ ");
        for(i=0;i<copyArray.length;i++){
            System.out.print(copyArray[i]+",");
        }System.out.print("]");
    }
}
