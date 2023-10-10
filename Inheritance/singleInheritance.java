// Single inheritance using java
import java.util.Scanner;

class A {
    public void firstClass(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of two number : " + sum);
        int sub = num1 - num2;
        System.out.println("Substraction of two number : " + sub);
    }
}

class B extends A {
    public void secondClass(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println("The multiplication of two number : " + mul);
        int div = num1 / num2;
        System.out.println("Division of two number is : " + div);
        int rem = num1 % num2;
        System.out.println("Reminder of two number : "+rem);
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enetr the first number : ");
        int n2 = sc.nextInt();
        B obj = new B();
        obj.firstClass(n1, n2);
        obj.secondClass(n1, n2);

    }
}