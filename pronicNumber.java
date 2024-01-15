import java.util.*;
public class pronicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt(),n=0,flag=0;
        while (n<=num) {
            if (n*(n+1)==num) {
                System.out.println("The result is : "+n+" * "+(n+1)+" : "+num);
                System.out.println("Its pronic.");
                flag=1;
                break;
            }
            else{
                flag=0;
            }
            n++;
        }
        if (flag==0) {
            System.out.println("Its not pronic number.");
        }
    }
}