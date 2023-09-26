package Arrays;

import java.util.*;
public class alphabet
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of elsements  : ");
        int num = sc.nextInt();
	    int i,j;
	    String arr[]= new String[num];
		String temp;
        int len=arr.length;

        // for user input
        System.out.println("Input the elements : ");
        for(i=0;i<num;i++){
            System.out.printf("Enter [%d] index value : ",i);
            arr[i]=sc.next();
        }

        // for check
		for(i=0;i<len;i++){
		    for(j=i+1;j<len;j++)
		    {
		        if (arr[i].compareTo(arr[j])>0)
		        {
		            temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
		        }
		    }
		}
        // Print that array 
		System.out.println("\nThe alphabetically order is : ");
		for(i=0;i<len;i++)
		{
		    System.out.println(" "+arr[i]);
		}
	}
}

