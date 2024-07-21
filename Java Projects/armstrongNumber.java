
import java.util.*;

public class armstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0, r;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println("Its armstrong.");
        } else {
            System.out.println("Not armstrong.");
        }
    }
}