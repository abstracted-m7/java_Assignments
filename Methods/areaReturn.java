// package oopJava;

// public class areaReturn {

//     public static int area(int side) {
//         int result=side*side;
//         return result;
//     }
//     public static void main(String[] args) {
//         int side;
//         side = 5;

//         System.out.println(area(side));
//     }
// }

package oopJava;

import java.util.Scanner;

class calculate {
    public static void area(int side) {
        int result = side * side;
        System.out.println("Using only one value : " + result);
    }

    public static void area(int side1, int side2) {
        int result = side1 * side2;
        System.out.println("Using two value : " + result);
    }
}

public class areaReturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculate obj = new calculate();
        System.out.print("Enter the value of side 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of side 2 : ");
        int b = sc.nextInt();
        obj.area(a);
        obj.area(a, b);
    }
}